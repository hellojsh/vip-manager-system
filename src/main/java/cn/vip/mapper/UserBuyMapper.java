package cn.vip.mapper;

import cn.vip.pojo.UserBuy;
import cn.vip.pojo.UserBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBuyMapper {
    int countByExample(UserBuyExample example);

    int deleteByExample(UserBuyExample example);

    int deleteByPrimaryKey(String buyId);

    int insert(UserBuy record);

    int insertSelective(UserBuy record);

    List<UserBuy> selectByExample(UserBuyExample example);

    UserBuy selectByPrimaryKey(String buyId);

    int updateByExampleSelective(@Param("record") UserBuy record, @Param("example") UserBuyExample example);

    int updateByExample(@Param("record") UserBuy record, @Param("example") UserBuyExample example);

    int updateByPrimaryKeySelective(UserBuy record);

    int updateByPrimaryKey(UserBuy record);
}