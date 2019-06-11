package cn.vip.service;

import cn.vip.pojo.Information;

import java.util.List;

public interface InfomationService {
    /**
     * 查询所有咨讯
     * @return
     */
    List<Information> findAllInfomation();

    /**
     * 按id查询咨讯详情
     * @return
     */
    Information findInfomationById(Long id);

    /**
     * 分页查询咨询列表
     * @return
     */
    List<Information> findAllInfomationByPage(Integer pageNo,Integer pageSize);

    /**
     * 查询总记录数
     * @return
     */
    int findCount();
}
