package cn.vip.controller;


import cn.vip.pojo.Affiche;
import cn.vip.pojo.AuUser;
import cn.vip.pojo.DataDictionary;
import cn.vip.pojo.Information;
import cn.vip.service.AfficheService;
import cn.vip.service.DictionaryService;
import cn.vip.service.InfomationService;
import cn.vip.utils.Constants;
import cn.vip.utils.JacksonUtil;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Controller的基类
 *
 * @author Taeyeon
 * @createTime 2019-06-10-15:50
 */
public class BaseController {

    private AuUser currentUser;

    @Resource
    private InfomationService infomationService;

    @Resource
    private AfficheService afficheService;

    @Resource
    private DictionaryService dictionaryService;


    //获取当前session中的用户
    public AuUser getCurrentUser() {
        if (null == this.currentUser) {
            HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session = request.getSession(false);
            if (session != null) {
                currentUser = (AuUser) session.getAttribute(Constants.LOGIN_USER);
            } else {
                currentUser = null;
            }
        }

        return currentUser;
    }

    //用户注销
    public boolean loginOut() {
        boolean flag = false;

        if (null == this.currentUser) {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session = request.getSession(false);

            if (session != null) {
                session.removeAttribute(Constants.LOGIN_USER);
                flag = true;
            }
        }
        return flag;
    }

    public void setCurrentUser(AuUser currentUser) {
        this.currentUser = currentUser;
    }

    /**
     * 日期国际化
     *
     * @param dataBinder
     */
    @InitBinder
    public void InitBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Date.class, new PropertyEditorSupport() {

            public void setAsText(String value) {
                try {
                    setValue(new SimpleDateFormat("yyyy-MM-dd").parse(value));
                } catch (ParseException e) {
                    e.printStackTrace();
                    setValue(null);
                }
            }

            public String getAsText() {
                return new SimpleDateFormat("yyyy-MM-dd").format((Date) getValue());
            }

        });
    }

    /**
     * 查询当前公告
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    protected List<Affiche> findAffiche(Integer pageNo, Integer pageSize) {
        List<Affiche> affiches = null;

        //查询公告
        affiches = afficheService.findAllAfficheByPage(pageNo, pageSize);

        if (affiches.size() > 0) {
            return affiches;
        }

        return affiches;
    }

    /**
     * 查询当前资讯
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    protected List<Information> findInfomation(Integer pageNo, Integer pageSize) {

        List<Information> infomations = null;

        //查询资讯
        infomations = infomationService.findAllInfomationByPage(pageNo, pageSize);

        if (infomations.size() > 0) {
            return infomations;
        }

        return infomations;
    }

    /**
     * 添加字典表
     */
    protected String addDic(String dic){
        DataDictionary dictionary = null;
        try {
            dictionary = JacksonUtil.json2Bean(dic, DataDictionary.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<DataDictionary> typeCodeList = dictionaryService.selectBy(dictionary.getTypeCode());
        for (DataDictionary list:typeCodeList) {
            if ( list.getValueName().equals(dictionary.getValueName())){
                //失败（数据重复）

                return "rename";
            }
        }
        if(dic == null){
            //失败（没有数据）
            return "nodata";
        }else {
            int cont = dictionaryService.addDic(dictionary);
            if (cont < 0){
                //添加失败
                return "failed";
            }else {
                //添加成功
                return "success";
            }
        }

    }
}
