package cn.vip.mapper;

import cn.vip.pojo.Uploadtemp;
import cn.vip.pojo.UploadtempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadtempMapper {
    int countByExample(UploadtempExample example);

    int deleteByExample(UploadtempExample example);

    int insert(Uploadtemp record);

    int insertSelective(Uploadtemp record);

    List<Uploadtemp> selectByExample(UploadtempExample example);

    int updateByExampleSelective(@Param("record") Uploadtemp record, @Param("example") UploadtempExample example);

    int updateByExample(@Param("record") Uploadtemp record, @Param("example") UploadtempExample example);
}