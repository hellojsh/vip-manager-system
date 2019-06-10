package cn.vip.mapper;

import cn.vip.pojo.UserPoint;
import cn.vip.pojo.UserPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointMapper {
    int countByExample(UserPointExample example);

    int deleteByExample(UserPointExample example);

    int deleteByPrimaryKey(String pointId);

    int insert(UserPoint record);

    int insertSelective(UserPoint record);

    List<UserPoint> selectByExample(UserPointExample example);

    UserPoint selectByPrimaryKey(String pointId);

    int updateByExampleSelective(@Param("record") UserPoint record, @Param("example") UserPointExample example);

    int updateByExample(@Param("record") UserPoint record, @Param("example") UserPointExample example);

    int updateByPrimaryKeySelective(UserPoint record);

    int updateByPrimaryKey(UserPoint record);
}