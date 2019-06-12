package cn.vip.controller;

import cn.vip.pojo.Affiche;
import cn.vip.pojo.DataDictionary;
import cn.vip.pojo.Information;
import cn.vip.service.AfficheService;
import cn.vip.service.DictionaryService;
import cn.vip.service.InfomationService;
import cn.vip.utils.JacksonUtil;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
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

    @Resource
    private DictionaryService dictionaryService;

    /**
     * 根据id查看公告详情
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/portalAfficheDetail.html")
    public String portalAfficheDetail(@RequestParam("id") Long id, Model model) {

        Affiche affiche = afficheService.findAfficheById(id);
        model.addAttribute("affiche", affiche);
        return "informanage/portalaffichedetail";
    }

    /**
     * 按分页查询公告信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/portalafficheList.html")
    public String portalAfficheDetail(Model model, @RequestParam("p") Integer currentPageNo) {
        //获取当前页码
        Integer _currentPageNo = currentPageNo != null ? currentPageNo : 1;
        PageSupport page = getAfficheByPage(_currentPageNo, 5);
        model.addAttribute("page", page);
        return "/informanage/portalaffichelist";
    }

    /**
     * 根据id查看资讯详情
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/portalInfoDetail.html")
    public String portalInfoDetail(@RequestParam("id") Long id, Model model) {

        Information information = infomationService.findInfomationById(id);
        model.addAttribute("information", information);
        return "informanage/portalinfodetail";
    }

    /**
     * 按分页查询资讯信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/portalinfoList.html")
    public String portalInfoList(Model model, @RequestParam("p") Integer currentPageNo) {
        //获取当前页码
        Integer _currentPageNo = currentPageNo != null ? currentPageNo : 1;
        PageSupport page = getInformationByPage(_currentPageNo, 5);
        model.addAttribute("page", page);
        return "/informanage/portalinfolist";
    }

    /**
     * 管理公告
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/affiche.html")
    public String affiche(Model model, @RequestParam(value = "p", required = false) Integer currentPageNo) {
        //获取当前页码
        Integer _currentPageNo = currentPageNo != null ? currentPageNo : 1;

        PageSupport page = getAfficheByPage(_currentPageNo, 5);
        model.addAttribute("page", page);
        return "/informanage/affiche";
    }

    /**
     * 管理资讯
     *
     * @param model
     * @param currentPageNo
     * @return
     */
    @RequestMapping(value = "/information.html")
    public String information(Model model, @RequestParam(value = "p", required = false) Integer currentPageNo) {

        //查询资讯类型
        List<DataDictionary> dicList = dictionaryService.selectBy("INFO_TYPE");


        //获取当前页码
        Integer _currentPageNo = currentPageNo != null ? currentPageNo : 1;

        PageSupport page = getInformationByPage(_currentPageNo, 5);
        model.addAttribute("page", page);
        model.addAttribute("dicList", dicList);

        return "/informanage/information";
    }

    /**
     * 分页查询公告
     *
     * @param currentPageNo
     * @param pageSize
     * @return
     */
    protected PageSupport getAfficheByPage(Integer currentPageNo, Integer pageSize) {
        PageSupport page = new PageSupport();

        //获取当前公告的总记录数
        int count = afficheService.findCount();
        page.setTotalCount(count);

        //设置当前页
        if (page.getTotalCount() > 0) {
            if (currentPageNo != null)
                page.setPage(currentPageNo);
            if (page.getPage() <= 0)
                page.setPage(1);
            if (page.getPage() > page.getPageCount())
                page.setPage(page.getPageCount());
        }

        //查询当前分页下的公告信息
        List<Affiche> affiches = this.findAffiche(page.getPage(), pageSize);

        page.setItems(affiches);

        return page;
    }

    /**
     * 分页查询资讯返回分页对象
     *
     * @param currentPageNo
     * @param pageSize
     * @return
     */
    protected PageSupport getInformationByPage(Integer currentPageNo, Integer pageSize) {
        PageSupport page = new PageSupport();

        //设置总记录数
        page.setTotalCount(infomationService.findCount());

        //设置当前页
        if (page.getTotalCount() > 0) {
            if (currentPageNo != null)
                page.setPage(currentPageNo);
            if (page.getPage() <= 0)
                page.setPage(1);
            if (page.getPage() > page.getPageCount())
                page.setPage(page.getPageCount());
        }

        //查询当前的资讯信息
        List<Information> informations = this.findInfomation(page.getPage(), pageSize);
        page.setItems(informations);

        return page;
    }

    /**
     * ajax查看公告
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/viewAffiche.html", method = RequestMethod.POST)
    @ResponseBody
    public String viewAuAffiche(@RequestParam("id") Long id) {
        if (id != null) {
            Affiche affiche = afficheService.findAfficheById(id);
            try {
                String json = JacksonUtil.bean2Json(affiche);
                return json;
            } catch (IOException e) {
                e.printStackTrace();
                return "failed";
            }
        } else {
            return "nodata";
        }
    }


    /**
     * ajax查看资讯
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/viewInfo.html", method = RequestMethod.POST)
    @ResponseBody
    public String viewInfo(@RequestParam("id") Long id) {
        if (id != null) {
            Information information = infomationService.findInfomationById(id);
            try {
                String json = JacksonUtil.bean2Json(information);
                return json;
            } catch (IOException e) {
                e.printStackTrace();
                return "failed";
            }
        } else {
            return "nodata";
        }
    }

    /**
     * 根据id删除公告信息
     *
     * @param id
     * @return
     */
    @PostMapping(value = "/delAffiche.html")
    @ResponseBody
    public String delAuAffiche(@RequestParam("id") Long id) {

        if (id != null) {
            boolean flag = false;
            try {
                flag = afficheService.delAuAfficheById(id);
                if (flag) {
                    return "success";
                } else {
                    return "failed";
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "failed";
            }

        } else {
            return "nodata";
        }

    }

    /**
     * 根据id
     *
     * @param id
     * @return
     */
    @PostMapping(value = "/delInfo.html")
    @ResponseBody
    public String delInfomation(@RequestParam("id") Long id) {

        if (id != null) {
            boolean flag = false;
            try {
                flag = infomationService.delInfomationById(id);
                if (flag) {
                    return "success";
                } else {
                    return "failed";
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "failed";
            }

        } else {
            return "nodata";
        }
    }

    @PostMapping(value = "/modifyInfoState.html")
    @ResponseBody
    public String modifyInfoState(@RequestParam("inforState") String inforState) {
        Information information = null;

        try {
            information = JacksonUtil.json2Bean(inforState, Information.class);
        } catch (IOException e) {
            e.printStackTrace();
            return "nodata";
        }

        int state = information.getState();

        //根据当前状态码动态生成要修改的状态码
        if (state == 0) {
            information.setState(1);
        } else if (state == 1) {
            information.setState(0);
        } else {
            return "nodata";
        }

        try {
            boolean flag = infomationService.modifyInfoState(information);
            if (flag) {
                return "success";
            } else {
                return "failed";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "nodata";
    }


}
