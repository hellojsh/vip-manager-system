package cn.vip.mapper;

import cn.vip.pojo.LeaveMessage;
import cn.vip.pojo.LeaveMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMessageMapper {
    int countByExample(LeaveMessageExample example);

    int deleteByExample(LeaveMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LeaveMessage record);

    int insertSelective(LeaveMessage record);

    List<LeaveMessage> selectByExampleWithBLOBs(LeaveMessageExample example);

    List<LeaveMessage> selectByExample(LeaveMessageExample example);

    LeaveMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);

    int updateByExample(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);

    int updateByPrimaryKeySelective(LeaveMessage record);

    int updateByPrimaryKeyWithBLOBs(LeaveMessage record);

    int updateByPrimaryKey(LeaveMessage record);

    List<LeaveMessage> selectByPage(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
}