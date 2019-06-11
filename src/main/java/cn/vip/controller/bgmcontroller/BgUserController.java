package cn.vip.controller.bgmcontroller;

import cn.vip.service.bgmanagement.BgUser;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author chai
 * @version 1.0.0
 * <p>
 * 后台用户管理controller
 * @create 2019/6/10
 */
@Controller
public class BgUserController {
    @Resource
    private BgUser bgUserImpl;

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
}
