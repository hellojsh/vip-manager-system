package cn.vip.mapper;

import cn.vip.pojo.UserAccount201312;
import cn.vip.pojo.UserAccount201312Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccount201312Mapper {
    int countByExample(UserAccount201312Example example);

    int deleteByExample(UserAccount201312Example example);

    int deleteByPrimaryKey(String accountId);

    int insert(UserAccount201312 record);

    int insertSelective(UserAccount201312 record);

    List<UserAccount201312> selectByExample(UserAccount201312Example example);

    UserAccount201312 selectByPrimaryKey(String accountId);

    int updateByExampleSelective(@Param("record") UserAccount201312 record, @Param("example") UserAccount201312Example example);

    int updateByExample(@Param("record") UserAccount201312 record, @Param("example") UserAccount201312Example example);

    int updateByPrimaryKeySelective(UserAccount201312 record);

    int updateByPrimaryKey(UserAccount201312 record);
}