package cn.vip.mapper;

import cn.vip.pojo.Affiche;
import cn.vip.pojo.AfficheExample;
import java.util.List;

import cn.vip.pojo.Information;
import org.apache.ibatis.annotations.Param;

public interface AfficheMapper {
    int countByExample(AfficheExample example);

    int deleteByExample(AfficheExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Affiche record);

    int insertSelective(Affiche record);

    List<Affiche> selectByExampleWithBLOBs(AfficheExample example);

    List<Affiche> selectByExample(AfficheExample example);

    Affiche selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByExampleWithBLOBs(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByExample(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByPrimaryKeySelective(Affiche record);

    int updateByPrimaryKeyWithBLOBs(Affiche record);

    int updateByPrimaryKey(Affiche record);

    List<Affiche> selectByPage(@Param("pageNo")Integer pageNo, @Param("pageSize")Integer pageSize);
}