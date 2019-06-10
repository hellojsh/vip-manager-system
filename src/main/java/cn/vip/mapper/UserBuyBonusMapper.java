package cn.vip.mapper;

import cn.vip.pojo.UserBuyBonus;
import cn.vip.pojo.UserBuyBonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBuyBonusMapper {
    int countByExample(UserBuyBonusExample example);

    int deleteByExample(UserBuyBonusExample example);

    int deleteByPrimaryKey(String buyBonusId);

    int insert(UserBuyBonus record);

    int insertSelective(UserBuyBonus record);

    List<UserBuyBonus> selectByExample(UserBuyBonusExample example);

    UserBuyBonus selectByPrimaryKey(String buyBonusId);

    int updateByExampleSelective(@Param("record") UserBuyBonus record, @Param("example") UserBuyBonusExample example);

    int updateByExample(@Param("record") UserBuyBonus record, @Param("example") UserBuyBonusExample example);

    int updateByPrimaryKeySelective(UserBuyBonus record);

    int updateByPrimaryKey(UserBuyBonus record);
}