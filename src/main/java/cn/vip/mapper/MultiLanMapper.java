package cn.vip.mapper;

import cn.vip.pojo.MultiLan;
import cn.vip.pojo.MultiLanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MultiLanMapper {
    int countByExample(MultiLanExample example);

    int deleteByExample(MultiLanExample example);

    int deleteByPrimaryKey(String elementId);

    int insert(MultiLan record);

    int insertSelective(MultiLan record);

    List<MultiLan> selectByExample(MultiLanExample example);

    MultiLan selectByPrimaryKey(String elementId);

    int updateByExampleSelective(@Param("record") MultiLan record, @Param("example") MultiLanExample example);

    int updateByExample(@Param("record") MultiLan record, @Param("example") MultiLanExample example);

    int updateByPrimaryKeySelective(MultiLan record);

    int updateByPrimaryKey(MultiLan record);
}