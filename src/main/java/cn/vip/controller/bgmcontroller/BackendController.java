package cn.vip.controller.bgmcontroller;

import cn.vip.service.bgmanagement.BackendUser;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author chai
 * @version 1.0.0
 * <p>
 * 后台管理controller
 * @create 2019/6/10
 */
@RequestMapping("/backend")
@Controller
public class BackendController {
    @Resource
    private BackendUser bgUserImpl;

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
