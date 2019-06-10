package cn.vip.controller;

import cn.vip.mapper.AuUserMapper;
import cn.vip.pojo.AuUser;
import cn.vip.pojo.AuUserExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author hellojsh
 * @create 2019-06-10 13:13
 */
@Controller
public class HelloController {

    @Resource
    private AuUserMapper auUserMapper;

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public List<AuUser> tset() {
        AuUserExample example = new AuUserExample();
        return auUserMapper.selectByExample(example);
    }
}
