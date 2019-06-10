package cn.vip.controller;

import cn.vip.pojo.AuUser;
import cn.vip.service.AuUserService;
import cn.vip.utils.Constants;
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

        AuUser auUser=auUserService.loginDo(loginUser.getLogincode());
        if (auUser != null){
            if(!auUser.getPassword().equals(loginUser.getPassword())){
                return "pwderror";
            }else {
                session.setAttribute("auUser", Constants.LOGIN_USER);
                return "success";
            }
        }else {
            return "nologincode";
        }
    }

}
