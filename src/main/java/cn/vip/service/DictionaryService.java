package cn.vip.service;

import cn.vip.pojo.DataDictionary;

import java.util.List;

/**
 * 字典表接口
 */
public interface DictionaryService {
    /**
     * typecode查询字典表
     * @return
     */
    List<DataDictionary> selectBy(String typecode);

    /**
     * 字典表全查询
     * @return
     */
    List<DataDictionary> queryBy();

    /**
     * 添加字典表
     * @param dataDictionary
     * @return
     */
    int addDic(DataDictionary dataDictionary);

    /**
     * 修改字典表
     * @param dataDictionary
     * @return
     */
    int updateDic(DataDictionary dataDictionary);

    /**
     *id删除字典表
     * @param id
     * @return
     */
    int deleteDic(Long id);

    /**
     * id查询字典表
     * @param id
     * @return
     */
    DataDictionary selectById(Long id);

}
