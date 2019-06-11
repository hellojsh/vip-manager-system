package cn.vip.service;

import cn.vip.pojo.Affiche;

import java.util.List;

public interface AfficheService {

    /**
     * 查询所有公告
     * @return
     */
    List<Affiche> findAllAffiche();

    /**
     * 按id查询公告详情
     * @return
     */
    Affiche findAfficheById(Long id);

    /**
     * 分页查询公告列表
     * @return
     */
    List<Affiche> findAllAfficheByPage(Integer pageNo,Integer pageSize);

    /**
     * 查询总记录数
     * @return
     */
    int findCount();
}
