package cn.vip.service.bgmanagement;

import cn.vip.pojo.AuUser;
import cn.vip.pojo.DataDictionary;
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

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    AuUser selectByPrimaryKey(Long id);

    /**
     * 获取用户类型
     * @return
     */
    List<DataDictionary> selectByExampleUser();

    /**
     * 获取证件类型
     * @return
     */
    List<DataDictionary> selectByExampleCard();

    /**
     * 用户名是否重复
     * @return
     */
    String selectByExampleLoginCode(String loginCode, Long id);

    /**
     * 删除用户
     * @param id
     * @return
     */
    String deleteByPrimaryKey(Long id);
}
