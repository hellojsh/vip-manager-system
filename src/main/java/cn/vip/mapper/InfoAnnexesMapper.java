package cn.vip.mapper;

import cn.vip.pojo.InfoAnnexes;
import cn.vip.pojo.InfoAnnexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoAnnexesMapper {
    int countByExample(InfoAnnexesExample example);

    int deleteByExample(InfoAnnexesExample example);

    int deleteByPrimaryKey(String id);

    int insert(InfoAnnexes record);

    int insertSelective(InfoAnnexes record);

    List<InfoAnnexes> selectByExample(InfoAnnexesExample example);

    InfoAnnexes selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InfoAnnexes record, @Param("example") InfoAnnexesExample example);

    int updateByExample(@Param("record") InfoAnnexes record, @Param("example") InfoAnnexesExample example);

    int updateByPrimaryKeySelective(InfoAnnexes record);

    int updateByPrimaryKey(InfoAnnexes record);
}