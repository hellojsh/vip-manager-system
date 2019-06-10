package cn.vip.mapper;

import cn.vip.pojo.BasicsParameter;
import cn.vip.pojo.BasicsParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicsParameterMapper {
    int countByExample(BasicsParameterExample example);

    int deleteByExample(BasicsParameterExample example);

    int deleteByPrimaryKey(String id);

    int insert(BasicsParameter record);

    int insertSelective(BasicsParameter record);

    List<BasicsParameter> selectByExample(BasicsParameterExample example);

    BasicsParameter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BasicsParameter record, @Param("example") BasicsParameterExample example);

    int updateByExample(@Param("record") BasicsParameter record, @Param("example") BasicsParameterExample example);

    int updateByPrimaryKeySelective(BasicsParameter record);

    int updateByPrimaryKey(BasicsParameter record);
}