package cn.vip.controller.bgmcontroller;

import cn.vip.pojo.AuRole;
import cn.vip.controller.BaseController;
import cn.vip.pojo.AuUser;
import cn.vip.pojo.DataDictionary;
import cn.vip.service.AuUserService;
import cn.vip.service.DictionaryService;
import cn.vip.service.bgmanagement.BackendUser;
import cn.vip.utils.EncryptUtil;
import cn.vip.utils.JacksonUtil;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

import org.springframework.web.bind.annotation.*;

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

    @Resource
    private DictionaryService dictionaryService;

    /**
     * 分页返回用户数据
     *
     * @return
     */
    @GetMapping("/userlist.html")
    public String goPage(@RequestParam(value = "currentpage", required = true, defaultValue = "1") Integer currentpage, Model model) {

        List<Object> list = bgUserImpl.bgLimitUser(currentpage);

        PageSupport page = (PageSupport) list.get(0);
        List<AuRole> roleList = (List<AuRole>) list.get(1);

        model.addAttribute("page", page);
        model.addAttribute("roleList", roleList);

        return "backend/userlist";
    }

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @RequestMapping("/getuser.action")
    @ResponseBody
    public AuUser viewUser(@RequestParam Long id) {
        AuUser auUser = bgUserImpl.selectByPrimaryKey(id);

        return auUser;
    }

    /**
     * 获取会员类型
     * @param s_role
     * @return
     */
    @RequestMapping("/loadUserTypeList.action")
    @ResponseBody
    public List<DataDictionary> getUserType(@RequestParam Long s_role) {
        List<DataDictionary> dataDictionaries = bgUserImpl.selectByExampleUser();

        return dataDictionaries;
    }

    /**
     * 获取证件类型
     * @param s_role
     * @return
     */
    @RequestMapping("/loadCardTypeList.action")
    @ResponseBody
    public List<DataDictionary> getCardType(@RequestParam Long s_role) {
        List<DataDictionary> dataDictionaries = bgUserImpl.selectByExampleCard();

        return dataDictionaries;
    }

    /**
     * 用户名是否重复
     * @param loginCode
     * @param id
     * @return
     */
    @RequestMapping("/logincodeisexit.action")
    @ResponseBody
    public String getLoginCode(@RequestParam String loginCode, @RequestParam Long id) {
        String integer = bgUserImpl.selectByExampleLoginCode(loginCode, id);

        return integer;
    }

    @RequestMapping("/deluser.action")
    @ResponseBody
    public String deleteUser(@RequestParam(value = "delId", required = true) Long id) {
        String delete = bgUserImpl.deleteByPrimaryKey(id);

        return delete;
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

            AuUser oldUser = this.getCurrentUser();

            if (oldUser != null) {
                String newUserPassword = EncryptUtil.MD5(user.getPassword());   //用户的原密码
                String newUserNewPassword = EncryptUtil.MD5(user.getPassword2());//用户的新密码

                //当前用户输入的原密码一致
                if (newUserPassword.equals(oldUser.getPassword())) {
                    //修改用户密码
                    boolean flag = auUserService.updatePasswordById(oldUser.getId(), newUserNewPassword, null);
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

    /**
     * 数据字典页面跳转
     * 显示数据字典表
     */
    @RequestMapping("/dicmanage.html")
    public String dictionaryDo(Model model){
        List<DataDictionary> dictionaryList = dictionaryService.queryBy();
        model.addAttribute("dataList",dictionaryList);
        return "/backend/dicmanage";
    }

    /**
     * 查询数据字典
     */
    @RequestMapping(value = "/getJsonDic.html",method = RequestMethod.POST)
    @ResponseBody
    public String selectDic(String tcode)  {
        List<DataDictionary> list = dictionaryService.selectBy(tcode);
        String s =null;
        try {
             s = JacksonUtil.bean2Json(list);
             if (s.equals("") && s == null){
                 return "nodata";
             }
        } catch (IOException e) {
            e.printStackTrace();
            return "failed";
        }
        return s;
    }

    /**
     * 添加字典表的类型代码和类型名称
     */
    @RequestMapping(value = "/addDic.html",method = RequestMethod.POST)
    @ResponseBody
    public String addDicTypeCode(String dic){
        String s = this.addDic(dic);
        return s;
    }



    /**
     * 添加字典表的数据名称
     */
    @RequestMapping(value = "/addDicSub.html",method = RequestMethod.POST)
    @ResponseBody
    public String addDicValueName(String dic) {
        String s = this.addDic(dic);
        return s;
    }

}
