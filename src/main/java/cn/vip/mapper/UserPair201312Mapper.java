package cn.vip.mapper;

import cn.vip.pojo.UserPair201312;
import cn.vip.pojo.UserPair201312Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPair201312Mapper {
    int countByExample(UserPair201312Example example);

    int deleteByExample(UserPair201312Example example);

    int deleteByPrimaryKey(String pairId);

    int insert(UserPair201312 record);

    int insertSelective(UserPair201312 record);

    List<UserPair201312> selectByExample(UserPair201312Example example);

    UserPair201312 selectByPrimaryKey(String pairId);

    int updateByExampleSelective(@Param("record") UserPair201312 record, @Param("example") UserPair201312Example example);

    int updateByExample(@Param("record") UserPair201312 record, @Param("example") UserPair201312Example example);

    int updateByPrimaryKeySelective(UserPair201312 record);

    int updateByPrimaryKey(UserPair201312 record);
}