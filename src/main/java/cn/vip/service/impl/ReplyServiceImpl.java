package cn.vip.service.impl;

import cn.vip.mapper.ReplyMapper;
import cn.vip.pojo.Reply;
import cn.vip.pojo.ReplyExample;
import cn.vip.service.ReplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ReplyServiceImpl implements ReplyService {

    @Resource
    private ReplyMapper replyMapper;

    @Override
    public List<Reply> getReplyList(Long messageId) {
        List<Reply> replyList = null;
        try {
            ReplyExample replyExample = new ReplyExample();
            ReplyExample.Criteria criteria = replyExample.createCriteria();
            criteria.andMessageIdEqualTo(messageId);
            replyList = replyMapper.selectByExample(replyExample);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return replyList;
    }
}
