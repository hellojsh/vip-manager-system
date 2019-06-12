package cn.vip.controller;

import cn.vip.pojo.AuUser;
import cn.vip.service.AuUserService;
import cn.vip.service.MemberService;
import cn.vip.utils.EncryptUtil;
import cn.vip.utils.JacksonUtil;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * 会员管理 Controller
 *
 * @author hellojsh
 * @create 2019-06-10 16:10
 */
@Api
@Controller
@RequestMapping("/member")
public class MemberController extends BaseController {

    @Resource
    private MemberService memberService;

    @Resource
    private AuUserService auUserService;

    /**
     * 修改个人密码页面的跳转
     *
     * @return
     */
    @RequestMapping(value = "/modifypersonalpwd.html")
    public String modifyPersonalPwd() {
        AuUser user = this.getCurrentUser();
        if (user != null) {
            return "/member/modifypersonalpwd";
        }
        return "index";
    }

    @RequestMapping(value = "savesecondpwd.html")
    @ResponseBody
    public String saveSecondPwd(@RequestParam("userJson") String userJson) {
        AuUser sessionUser = this.getCurrentUser();
        if (null == userJson || "".equals(userJson)) {
            return "nodata";
        } else {
            try {
                AuUser user = JacksonUtil.json2Bean(userJson, AuUser.class);

                if (auUserService.findUserById(sessionUser.getId()).getPassword2().equals(EncryptUtil.MD5(user.getPassword()))) {

                    auUserService.updatePasswordById(sessionUser.getId(), null, EncryptUtil.MD5(user.getPassword2()));
                } else {
                    return "oldpwdwrong";
                }
            } catch (Exception e) {
                return "failed";
            }
        }
        return "success";
    }
}
