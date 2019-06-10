package cn.vip.mapper;

import cn.vip.pojo.UserRefer;
import cn.vip.pojo.UserReferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserReferMapper {
    int countByExample(UserReferExample example);

    int deleteByExample(UserReferExample example);

    int deleteByPrimaryKey(String referLogId);

    int insert(UserRefer record);

    int insertSelective(UserRefer record);

    List<UserRefer> selectByExample(UserReferExample example);

    UserRefer selectByPrimaryKey(String referLogId);

    int updateByExampleSelective(@Param("record") UserRefer record, @Param("example") UserReferExample example);

    int updateByExample(@Param("record") UserRefer record, @Param("example") UserReferExample example);

    int updateByPrimaryKeySelective(UserRefer record);

    int updateByPrimaryKey(UserRefer record);
}