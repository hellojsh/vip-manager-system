package cn.vip.service;

import cn.vip.pojo.Reply;

import java.util.List;

public interface ReplyService {
    /**
     * 通过留言id查询回复信息
     * @param messageId
     * @return
     */
    List<Reply> getReplyList(Long messageId);
}
