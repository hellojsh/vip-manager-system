package cn.vip.mapper;

import cn.vip.pojo.GoodsInfo;
import cn.vip.pojo.GoodsInfoExample;
import cn.vip.pojo.GoodsInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsInfoMapper {
    int countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsInfoWithBLOBs record);

    int insertSelective(GoodsInfoWithBLOBs record);

    List<GoodsInfoWithBLOBs> selectByExampleWithBLOBs(GoodsInfoExample example);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    GoodsInfoWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsInfoWithBLOBs record, @Param("example") GoodsInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsInfoWithBLOBs record, @Param("example") GoodsInfoExample example);

    int updateByExample(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    int updateByPrimaryKeySelective(GoodsInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsInfoWithBLOBs record);

    int updateByPrimaryKey(GoodsInfo record);
}