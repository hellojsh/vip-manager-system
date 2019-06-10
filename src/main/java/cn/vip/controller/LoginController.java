package cn.vip.controller;

import cn.vip.pojo.AuAuthority;
import cn.vip.pojo.AuFunction;
import cn.vip.pojo.AuUser;
import cn.vip.pojo.Menu;
import cn.vip.service.AuFunctionService;
import cn.vip.service.AuUserService;
import cn.vip.utils.Constants;
import cn.vip.utils.EncryptUtil;
import cn.vip.utils.JacksonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class LoginController{

    @Resource
    private AuFunctionService auFunctionService;

    @Resource
    private AuUserService auUserService;


    /**
     * 用户登陆
     *
     * @param user
     * @param session
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    @ResponseBody
    public String liginDo(@RequestParam(value = "user") String user, HttpSession session) throws IOException {

        AuUser loginUser = JacksonUtil.json2Bean(user, AuUser.class);
        String password = EncryptUtil.MD5(loginUser.getPassword());
        AuUser auUser = auUserService.loginDo(loginUser.getLogincode());

        if (auUser != null) {
            if (!password.equals(auUser.getPassword())) {
                return "pwderror";
            } else {
                session.setAttribute(Constants.LOGIN_USER, auUser);
                return "success";
            }
        } else {
            return "nologincode";
        }
    }


    @RequestMapping(value = "/main.html")
    public String main(Model model,HttpSession session) {
        AuUser auUser = (AuUser) session.getAttribute(Constants.LOGIN_USER);

        List<Menu> mList = null;

        if (null != auUser) {
            System.out.println(auUser.toString());
            model.addAttribute("user", auUser);

            //获取菜单列表
            mList = getFunByCurrentUser(auUser.getRoleid());

            if (mList != null) {
                try {
                    String jsonString = JacksonUtil.bean2Json(mList);
                    model.addAttribute("mList", jsonString);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "main";
    }

    /**
     * 根据当前用户角色获取功能列表
     *
     * @param roleId
     * @return
     */
    protected List<Menu> getFunByCurrentUser(Long roleId) {
        List<Menu> menuList = new ArrayList<>();
        AuAuthority auAuthority = new AuAuthority(); //用户的权限类
        auAuthority.setRoleid(roleId);

        try {
            List<AuFunction> mainFunctionList = auFunctionService.getMainFunctionList(auAuthority);

            if (mainFunctionList != null) {
                for (AuFunction auFunction : mainFunctionList) {
                    Menu menu = new Menu();
                    menu.setMainMenu(auFunction);
                    //根据父菜单查询子菜单
                    List<AuFunction> subFunctionList = auFunctionService.getSubFunctionList(auFunction);

                    if (subFunctionList != null) {
                        menu.setSubMenus(subFunctionList);
                    }

                    menuList.add(menu);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return menuList;
    }

    @RequestMapping(value = "/logout.html")
    public String logout(HttpSession session) {
        AuUser auUser = (AuUser) session.getAttribute(Constants.LOGIN_USER);

        if(auUser !=null){
            session.removeAttribute(Constants.LOGIN_USER);
        }

        return "index";
    }
}
