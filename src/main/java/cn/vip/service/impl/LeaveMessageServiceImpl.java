package cn.vip.service.impl;

import cn.vip.mapper.LeaveMessageMapper;
import cn.vip.pojo.LeaveMessage;
import cn.vip.pojo.LeaveMessageExample;
import cn.vip.service.LeaveMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveMessageServiceImpl implements LeaveMessageService {

    @Resource
    private LeaveMessageMapper leaveMessageMapper;

    /**
     * 查询所有的留言列表
     *
     * @return
     */
    @Override
    public List<LeaveMessage> findAllMessage(Integer pageNo, Integer pageSize) {
        List<LeaveMessage> leaveMessages = null;
        try {
            pageNo = (pageNo - 1) * pageSize;
            leaveMessages = leaveMessageMapper.selectByPage(pageNo, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leaveMessages;
    }

    /**
     * 查询总记录数
     *
     * @return
     */
    @Override
    public int findCount() {
        int count = 0;
        try {
            LeaveMessageExample leaveMessageExample = new LeaveMessageExample();
            count = leaveMessageMapper.countByExample(leaveMessageExample);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 通过id删除留言
     *
     * @param id
     * @return
     */
    @Override
    public boolean delMessage(Long id) {
        boolean flag = false;
        try {
            int delete = leaveMessageMapper.deleteByPrimaryKey(id);
            if (delete > 0) {
                flag = true;
            } else {
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public LeaveMessage getMessageById(Long id) {

        LeaveMessage leaveMessage = null;
        try {
            leaveMessage = leaveMessageMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return leaveMessage;
    }
}
