package cn.vip.mapper;

import cn.vip.pojo.UserAccount201404;
import cn.vip.pojo.UserAccount201404Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccount201404Mapper {
    int countByExample(UserAccount201404Example example);

    int deleteByExample(UserAccount201404Example example);

    int deleteByPrimaryKey(Integer accountId);

    int insert(UserAccount201404 record);

    int insertSelective(UserAccount201404 record);

    List<UserAccount201404> selectByExample(UserAccount201404Example example);

    UserAccount201404 selectByPrimaryKey(Integer accountId);

    int updateByExampleSelective(@Param("record") UserAccount201404 record, @Param("example") UserAccount201404Example example);

    int updateByExample(@Param("record") UserAccount201404 record, @Param("example") UserAccount201404Example example);

    int updateByPrimaryKeySelective(UserAccount201404 record);

    int updateByPrimaryKey(UserAccount201404 record);
}