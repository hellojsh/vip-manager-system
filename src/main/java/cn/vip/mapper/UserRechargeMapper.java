package cn.vip.mapper;

import cn.vip.pojo.UserRecharge;
import cn.vip.pojo.UserRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRechargeMapper {
    int countByExample(UserRechargeExample example);

    int deleteByExample(UserRechargeExample example);

    int deleteByPrimaryKey(String rechargeId);

    int insert(UserRecharge record);

    int insertSelective(UserRecharge record);

    List<UserRecharge> selectByExample(UserRechargeExample example);

    UserRecharge selectByPrimaryKey(String rechargeId);

    int updateByExampleSelective(@Param("record") UserRecharge record, @Param("example") UserRechargeExample example);

    int updateByExample(@Param("record") UserRecharge record, @Param("example") UserRechargeExample example);

    int updateByPrimaryKeySelective(UserRecharge record);

    int updateByPrimaryKey(UserRecharge record);
}