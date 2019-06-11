package cn.vip.service.bgmanagement;

import cn.vip.utils.PageSupport;

import java.util.List;


/**
 * @author chai
 * @version 1.0.0
 * <p>
 * 后台用户管理service类
 * @create 2019/6/10
 */
public interface BackendUser {

    /**
     * 获取分页数据
     *
     * @return
     */
    List<Object> bgLimitUser(Integer pageNo);
}
