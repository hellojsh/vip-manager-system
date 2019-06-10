package cn.vip.mapper;

import cn.vip.pojo.AuAuthority;
import cn.vip.pojo.AuAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuAuthorityMapper {
    int countByExample(AuAuthorityExample example);

    int deleteByExample(AuAuthorityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuAuthority record);

    int insertSelective(AuAuthority record);

    List<AuAuthority> selectByExample(AuAuthorityExample example);

    AuAuthority selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuAuthority record, @Param("example") AuAuthorityExample example);

    int updateByExample(@Param("record") AuAuthority record, @Param("example") AuAuthorityExample example);

    int updateByPrimaryKeySelective(AuAuthority record);

    int updateByPrimaryKey(AuAuthority record);
}