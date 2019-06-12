package cn.vip.service;

import cn.vip.pojo.Information;

import java.util.List;

public interface InfomationService {
    /**
     * 查询所有咨讯
     *
     * @return
     */
    List<Information> findAllInfomation();

    /**
     * 按id查询咨讯详情
     *
     * @return
     */
    Information findInfomationById(Long id);

    /**
     * 分页查询咨询列表
     *
     * @return
     */
    List<Information> findAllInfomationByPage(Integer pageNo, Integer pageSize);

    /**
     * 查询总记录数
     *
     * @return
     */
    int findCount();

    /**
     * 根据id删除资讯信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean delInfomationById(Long id) throws Exception;


    /**
     * 根据id修改当前状态
     *
     * @param information
     * @return
     * @throws Exception
     */
    boolean modifyInfoState(Information information) throws Exception;
}
