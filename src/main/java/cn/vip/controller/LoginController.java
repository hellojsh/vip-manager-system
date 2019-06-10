package cn.vip.controller;

import cn.vip.pojo.AuUser;
import cn.vip.service.AuUserService;
import cn.vip.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Resource
    private AuUserService auUserService;

    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    @ResponseBody
    public String liginDo(String logincode, String password, HttpSession session){
        AuUser auUser = null;
        auUser=auUserService.loginDo(logincode);
        if (auUser != null){
            if(!auUser.getPassword().equals(password)){
                auUser=null;
                return "failed";
            }else {
                session.setAttribute("auUser", Constants.LOGIN_USER);
                return "success";
            }
        }else {
            auUser=null;
            return "nologincode";
        }
    }

}
