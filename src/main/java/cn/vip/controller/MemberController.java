package cn.vip.controller;

import cn.vip.pojo.AuUser;
import cn.vip.pojo.DataDictionary;
import cn.vip.service.DictionaryService;
import cn.vip.service.MemberService;
import cn.vip.utils.JacksonUtil;
import cn.vip.utils.PageSupport;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
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
    @Resource
    private DictionaryService dictionaryService;

    /**
     * 查询会员信息
     * @param id 会员id
     * @param model 封装信息模型
     * @return json String
     */
    @PostMapping("/backend/getuser.html")
    @ResponseBody
    public String getUser(@RequestParam("id") Long id, Model model) {
        try {
            // 获取到会员信息
            AuUser currentUser = memberService.getAuUserById(id);
            if(currentUser == null) {
                return "nodata";
            }
            String s = JacksonUtil.bean2Json(currentUser);
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "failed";
        }
    }

    /**
     * 获取会员列表
     * @param model 存放对象的模型
     * @return 对应的视图名
     */
    @RequestMapping("/member/memberlist.html")
    public String memberList(Model model) {
        PageSupport page = new PageSupport();
        // 查询所有的会员类型信息
        List<DataDictionary> userTypeList = dictionaryService.selectBy("USER_TYPE");
        // 获取到所有的证件类型信息
        List<DataDictionary> cardTypeList = dictionaryService.selectBy("CARD_TYPE");

        model.addAttribute("cardTypeList", cardTypeList);
        model.addAttribute("userTypeList", userTypeList);

        List<AuUser> auUserList = memberService.getAuUserList();
        page.setItems(auUserList);

        model.addAttribute("page", page);
        return "member/memberlist";
    }
}
