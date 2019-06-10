package cn.vip.mapper;

import cn.vip.pojo.UserPlace;
import cn.vip.pojo.UserPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPlaceMapper {
    int countByExample(UserPlaceExample example);

    int deleteByExample(UserPlaceExample example);

    int deleteByPrimaryKey(String placeId);

    int insert(UserPlace record);

    int insertSelective(UserPlace record);

    List<UserPlace> selectByExample(UserPlaceExample example);

    UserPlace selectByPrimaryKey(String placeId);

    int updateByExampleSelective(@Param("record") UserPlace record, @Param("example") UserPlaceExample example);

    int updateByExample(@Param("record") UserPlace record, @Param("example") UserPlaceExample example);

    int updateByPrimaryKeySelective(UserPlace record);

    int updateByPrimaryKey(UserPlace record);
}