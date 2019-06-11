package cn.vip.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 跳转欢迎页面
 *
 * @author Taeyeon
 * @create 2019-06-10 13:13
 */
@Api
@Controller
public class HelloController {

    @ApiOperation(value = "跳转到登录页面", httpMethod = "GET")
    @RequestMapping("/")
    public String hello() {
        return "index";
    }

}
