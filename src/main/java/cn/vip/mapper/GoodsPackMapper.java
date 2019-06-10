package cn.vip.mapper;

import cn.vip.pojo.GoodsPack;
import cn.vip.pojo.GoodsPackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPackMapper {
    int countByExample(GoodsPackExample example);

    int deleteByExample(GoodsPackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsPack record);

    int insertSelective(GoodsPack record);

    List<GoodsPack> selectByExampleWithBLOBs(GoodsPackExample example);

    List<GoodsPack> selectByExample(GoodsPackExample example);

    GoodsPack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);

    int updateByExample(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);

    int updateByPrimaryKeySelective(GoodsPack record);

    int updateByPrimaryKeyWithBLOBs(GoodsPack record);

    int updateByPrimaryKey(GoodsPack record);
}