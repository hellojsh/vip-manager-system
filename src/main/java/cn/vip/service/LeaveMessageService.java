package cn.vip.service;

import cn.vip.pojo.LeaveMessage;

import java.util.List;

public interface LeaveMessageService {
    /**
     * 查询所有的留言信息
     * @return
     */
    List<LeaveMessage> findAllMessage(Integer pageNo,Integer pageSize);

    /**
     * 查询总记录数
     * @return
     */
    int findCount();

    /**
     * 通过id删除留言
     * @param id
     * @return
     */
    boolean delMessage(Long id);

    /**
     * 通过id查看留言详情
     * @param id
     * @return
     */
    LeaveMessage getMessageById(Long id);
}
