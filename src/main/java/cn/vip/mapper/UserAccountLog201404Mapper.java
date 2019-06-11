package cn.vip.mapper;

import cn.vip.pojo.UserAccountLog201404;
import cn.vip.pojo.UserAccountLog201404Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountLog201404Mapper {
    int countByExample(UserAccountLog201404Example example);

    int deleteByExample(UserAccountLog201404Example example);

    int deleteByPrimaryKey(Long accountLogId);

    int insert(UserAccountLog201404 record);

    int insertSelective(UserAccountLog201404 record);

    List<UserAccountLog201404> selectByExample(UserAccountLog201404Example example);

    UserAccountLog201404 selectByPrimaryKey(Long accountLogId);

    int updateByExampleSelective(@Param("record") UserAccountLog201404 record, @Param("example") UserAccountLog201404Example example);

    int updateByExample(@Param("record") UserAccountLog201404 record, @Param("example") UserAccountLog201404Example example);

    int updateByPrimaryKeySelective(UserAccountLog201404 record);

    int updateByPrimaryKey(UserAccountLog201404 record);
}