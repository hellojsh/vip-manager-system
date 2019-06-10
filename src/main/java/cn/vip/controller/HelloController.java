package cn.vip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 跳转欢迎页面
 *
 * @author Taeyeon
 * @create 2019-06-10 13:13
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

}
