package cn.vip.controller;


import cn.vip.pojo.AuUser;
import cn.vip.utils.Constants;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Controller的基类
 *
 * @author Taeyeon
 * @createTime 2019-06-10-15:50
 */
public class BaseController {

    private AuUser currentUser;

    //获取当前session中的用户
    public AuUser getCurrentUser() {
        if (null == this.currentUser) {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session = request.getSession(false);
            if (session != null) {
                currentUser = (AuUser) session.getAttribute(Constants.LOGIN_USER);
            } else {
                currentUser = null;
            }
        }

        return currentUser;
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

}
