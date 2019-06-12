package cn.vip.controller;

import cn.vip.pojo.Affiche;
import cn.vip.pojo.Information;
import cn.vip.service.AfficheService;
import cn.vip.service.InfomationService;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * 信息管理Controller
 *
 * @author Taeyeon
 * @createTime 2019-06-11-8:47
 */

@RequestMapping(value = "/informanage")
@Controller
public class InforManageController extends BaseController {

    @Resource
    private AfficheService afficheService;

    @Resource
    private InfomationService infomationService;

    @RequestMapping(value = "/portalAfficheDetail.html")
    public String portalAfficheDetail(@RequestParam("id") Long id, Model model) {

        Affiche affiche = afficheService.findAfficheById(id);
        model.addAttribute("affiche", affiche);
        return "informanage/portalaffichedetail";
    }

    @RequestMapping(value = "/portalafficheList.html")
    public String portalAfficheDetail(Model model) {
        PageSupport page = new PageSupport();

        List<Affiche> affiches = afficheService.findAllAfficheByPage(1, 5);

        int count = afficheService.findCount();
        page.setTotalCount(count);
        page.setPage(1);
        page.setPageSize(5);
        page.setItems(affiches);

        model.addAttribute("page", page);
        return "/informanage/portalaffichelist";
    }

    @RequestMapping(value = "/portalInfoDetail.html")
    public String portalInfoDetail(@RequestParam("id") Long id, Model model) {

        Information information = infomationService.findInfomationById(id);
        model.addAttribute("information", information);
        return "informanage/portalinfodetail";
    }

    @RequestMapping(value = "/portalinfoList.html")
    public String portalInfoList(Model model) {
        PageSupport page = new PageSupport();

        List<Information> informations = infomationService.findAllInfomationByPage(1, 5);

        int count = infomationService.findCount();
        page.setTotalCount(count);
        page.setPage(1);
        page.setPageSize(5);
        page.setItems(informations);

        model.addAttribute("page", page);
        return "/informanage/portalinfolist";
    }

}
