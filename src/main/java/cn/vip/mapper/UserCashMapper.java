package cn.vip.mapper;

import cn.vip.pojo.UserCash;
import cn.vip.pojo.UserCashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCashMapper {
    int countByExample(UserCashExample example);

    int deleteByExample(UserCashExample example);

    int deleteByPrimaryKey(String cashId);

    int insert(UserCash record);

    int insertSelective(UserCash record);

    List<UserCash> selectByExample(UserCashExample example);

    UserCash selectByPrimaryKey(String cashId);

    int updateByExampleSelective(@Param("record") UserCash record, @Param("example") UserCashExample example);

    int updateByExample(@Param("record") UserCash record, @Param("example") UserCashExample example);

    int updateByPrimaryKeySelective(UserCash record);

    int updateByPrimaryKey(UserCash record);
}