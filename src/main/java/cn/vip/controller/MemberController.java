package cn.vip.controller;

import cn.vip.pojo.AuUser;
import cn.vip.service.AuUserService;
import cn.vip.service.MemberService;
import cn.vip.utils.PageSupport;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员管理 Controller
 * @author hellojsh
 * @create 2019-06-10 16:10
 */
@Api
@Controller
public class MemberController {

    @Resource
    private MemberService memberService;

    /**
     * 获取会员列表
     * @param model
     * @return
     */
    @RequestMapping("/member/memberlist.html")
    public String test(Model model) {
        PageSupport page = new PageSupport();
        List<AuUser> auUserList = memberService.getAuUserList();
        page.setItems(auUserList);

        model.addAttribute("page", page);
        return "member/memberlist";
    }
}
