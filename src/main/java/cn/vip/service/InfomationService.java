package cn.vip.service;

import cn.vip.pojo.Information;

import java.util.List;

public interface InfomationService {
    /**
     * 查询所有咨询
     * @return
     */
    List<Information> findAllInfomation();

    /**
     * 按id查询咨询详情
     * @return
     */
    Information findInfomationById(Long id);
}
