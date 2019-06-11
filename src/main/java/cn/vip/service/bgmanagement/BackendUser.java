package cn.vip.service.bgmanagement;

import cn.vip.utils.PageSupport;


/**
 * @author chai
 * @version 1.0.0
 * <p>
 * 后台用户管理service类
 * @create 2019/6/10
 */
public interface BackendUser {
    /**
     * 获取全部的用户
     *
     * @return
     */
    PageSupport bgAllUser();
}
