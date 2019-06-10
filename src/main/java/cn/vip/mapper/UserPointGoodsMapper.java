package cn.vip.mapper;

import cn.vip.pojo.UserPointGoods;
import cn.vip.pojo.UserPointGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointGoodsMapper {
    int countByExample(UserPointGoodsExample example);

    int deleteByExample(UserPointGoodsExample example);

    int deleteByPrimaryKey(String pointGoodsId);

    int insert(UserPointGoods record);

    int insertSelective(UserPointGoods record);

    List<UserPointGoods> selectByExample(UserPointGoodsExample example);

    UserPointGoods selectByPrimaryKey(String pointGoodsId);

    int updateByExampleSelective(@Param("record") UserPointGoods record, @Param("example") UserPointGoodsExample example);

    int updateByExample(@Param("record") UserPointGoods record, @Param("example") UserPointGoodsExample example);

    int updateByPrimaryKeySelective(UserPointGoods record);

    int updateByPrimaryKey(UserPointGoods record);
}