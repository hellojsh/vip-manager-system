package cn.vip.mapper;

import cn.vip.pojo.GoodsPackAffiliated;
import cn.vip.pojo.GoodsPackAffiliatedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPackAffiliatedMapper {
    int countByExample(GoodsPackAffiliatedExample example);

    int deleteByExample(GoodsPackAffiliatedExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsPackAffiliated record);

    int insertSelective(GoodsPackAffiliated record);

    List<GoodsPackAffiliated> selectByExample(GoodsPackAffiliatedExample example);

    GoodsPackAffiliated selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsPackAffiliated record, @Param("example") GoodsPackAffiliatedExample example);

    int updateByExample(@Param("record") GoodsPackAffiliated record, @Param("example") GoodsPackAffiliatedExample example);

    int updateByPrimaryKeySelective(GoodsPackAffiliated record);

    int updateByPrimaryKey(GoodsPackAffiliated record);
}