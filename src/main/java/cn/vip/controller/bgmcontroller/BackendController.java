package cn.vip.controller.bgmcontroller;

import cn.vip.controller.BaseController;
import cn.vip.pojo.AuUser;
import cn.vip.service.AuUserService;
import cn.vip.service.bgmanagement.BackendUser;
import cn.vip.utils.EncryptUtil;
import cn.vip.utils.JacksonUtil;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author chai
 * @version 1.0.0
 * <p>
 * 后台管理controller
 * @create 2019/6/10
 */
@RequestMapping("/backend")
@Controller
public class BackendController extends BaseController {
    @Resource
    private BackendUser bgUserImpl;

    @Resource
    private AuUserService auUserService;

    /**
     * 返回全部的用户 type:json
     *
     * @return
     */
    @GetMapping("/showUser")
    public String goPage(Model model) {

        PageSupport page = bgUserImpl.bgAllUser();

        model.addAttribute("page", page);

        return "backend/userlist";
    }

    /**
     * 用户修改密码
     *
     * @return
     */
    @PostMapping("/modifyPwd.html")
    @ResponseBody
    public String modifyPwd(@RequestParam(value = "userJson") String userJson) {

        try {
            AuUser user = JacksonUtil.json2Bean(userJson, AuUser.class);

            AuUser oldUser = auUserService.findUserById(this.getCurrentUser().getId());

            if (oldUser != null) {
                String newUserPassword = EncryptUtil.MD5(user.getPassword());   //用户的原密码
                String newUserNewPassword = EncryptUtil.MD5(user.getPassword2());//用户的新密码

                //当前用户输入的原密码一致
                if (newUserPassword.equals(oldUser.getPassword())) {
                    //修改用户密码
                    boolean flag = auUserService.updatePasswordById(oldUser.getId(), newUserNewPassword, newUserNewPassword);
                    if (flag) { //密码修改成功
                        return "success";
                    } else {
                        return "failed";
                    }
                } else {
                    return "oldpwdwrong";
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
            return "nodata";
        }
        return "nodata";
    }
}
