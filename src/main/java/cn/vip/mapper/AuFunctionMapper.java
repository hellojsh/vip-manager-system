package cn.vip.mapper;

import cn.vip.pojo.AuAuthority;
import cn.vip.pojo.AuFunction;
import cn.vip.pojo.AuFunctionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AuFunctionMapper {
    int countByExample(AuFunctionExample example);

    int deleteByExample(AuFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuFunction record);

    int insertSelective(AuFunction record);

    List<AuFunction> selectByExample(AuFunctionExample example);

    AuFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuFunction record, @Param("example") AuFunctionExample example);

    int updateByExample(@Param("record") AuFunction record, @Param("example") AuFunctionExample example);

    int updateByPrimaryKeySelective(AuFunction record);

    int updateByPrimaryKey(AuFunction record);

    /**
     * 查询主菜单
     *
     * @param auAuthority
     * @return
     * @throws Exception
     */
    List<AuFunction> getMainFunctionList(AuAuthority auAuthority) throws Exception;

    /**
     * 获取子菜单
     *
     * @param auFunction
     * @return
     * @throws Exception
     */
    List<AuFunction> getSubFunctionList(AuFunction auFunction) throws Exception;
}