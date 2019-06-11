package cn.vip.controller.bgmcontroller;

import cn.vip.pojo.AuRole;
import cn.vip.service.bgmanagement.BackendUser;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
     * 返回全部的用户
     *
     * @return
     */
    @GetMapping("/userlist.html")
    public String goPage(@RequestParam Integer currentpage, Model model) {

        List<Object> list = bgUserImpl.bgLimitUser(currentpage);

        PageSupport page = (PageSupport) list.get(0);
        List<AuRole> roleList = (List<AuRole>) list.get(1);

        model.addAttribute("page", page);
        model.addAttribute("roleList", roleList);

        return "backend/userlist";
    }
}
