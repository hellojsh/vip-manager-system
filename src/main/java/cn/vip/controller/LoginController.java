package cn.vip.controller;

import cn.vip.pojo.AuUser;
import cn.vip.service.AuUserService;
import cn.vip.utils.Constants;
import cn.vip.utils.EncryptUtil;
import cn.vip.utils.JacksonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
@RequestMapping
public class LoginController {

    @Resource
    private AuUserService auUserService;

    /**
     * 用户登陆
     * @param user
     * @param session
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    @ResponseBody
    public String liginDo(@RequestParam(value ="user") String user, HttpSession session) throws IOException {
        AuUser loginUser = JacksonUtil.json2Bean(user, AuUser.class);
        String password = EncryptUtil.MD5(loginUser.getPassword());
        AuUser auUser=auUserService.loginDo(loginUser.getLogincode());
        if (auUser != null){
            if(!password.equals(auUser.getPassword())){
                return "pwderror";
            }else {
                System.out.println(auUser.toString());
                session.setAttribute(Constants.LOGIN_USER,auUser);
                return "success";
            }
        }else {
            return "nologincode";
        }
    }

}
