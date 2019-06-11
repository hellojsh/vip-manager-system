package cn.vip.controller;

import cn.vip.pojo.AuUser;
import cn.vip.pojo.DataDictionary;
import cn.vip.service.AuUserService;
import cn.vip.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping
public class AuUserController {

    @Resource
    private AuUserService auUserService;
    @Resource
    private DictionaryService dictionaryService;

    /**
     * 注册页面跳转
     * @return
     */
    @RequestMapping("/member/registmember.html")
    public String doRegistmember(Model model){
        //查询字典表用来显示证件类型
        List<DataDictionary> dictionaryList = dictionaryService.selectBy("CARD_TYPE");
        model.addAttribute("cardTypeList",dictionaryList);

        return "/member/registmember";
    }

    /**
     * 注册
     * @param auUser
     * @param model
     * @return
     */
    @RequestMapping(value = "/member/saveregistmember.html",method = RequestMethod.POST)
    public String auUserRegisterDo(AuUser auUser, Model model){

        int register = auUserService.auUserRegister(auUser);

        if (register <=0){
            //注册失败
            return "/member/registmember";
        }
        //注册成功
        model.addAttribute("registUser",auUser);
        return "/member/registok";
    }
}
