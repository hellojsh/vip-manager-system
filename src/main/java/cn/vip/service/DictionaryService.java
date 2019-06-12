package cn.vip.service;

import cn.vip.pojo.DataDictionary;

import java.util.List;

/**
 * 字典表接口
 */
public interface DictionaryService {
    /**
     * 查询字典表
     * @return
     */
    List<DataDictionary> selectBy(String typecode);
}
