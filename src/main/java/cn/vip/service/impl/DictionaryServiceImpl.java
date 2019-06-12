package cn.vip.service.impl;

import cn.vip.mapper.DataDictionaryMapper;
import cn.vip.pojo.DataDictionary;
import cn.vip.pojo.DataDictionaryExample;
import cn.vip.service.DictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    /**
     * typecode查询字典表
     * @param typecode
     * @return
     */
    @Override
    public List<DataDictionary> selectBy(String typecode) {
        DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = dataDictionaryExample.createCriteria();
        criteria.andTypeCodeEqualTo(typecode);
        List<DataDictionary> dictionaryList = dataDictionaryMapper.selectByExample(dataDictionaryExample);
        return dictionaryList;

    }

    /**
     * 字典表全查询
     * @return
     */
    @Override
    public List<DataDictionary> queryBy() {
        DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
        List<DataDictionary> list = dataDictionaryMapper.selectByExample(dataDictionaryExample);
        return list;
    }

    /**
     * 添加
     * @param dataDictionary
     * @return
     */
    @Override
    public int addDic(DataDictionary dataDictionary) {
        int cont = dataDictionaryMapper.insertSelective(dataDictionary);
        return cont;
    }

    /**
     * 修改
     * @param dataDictionary
     * @return
     */
    @Override
    public int updateDic(DataDictionary dataDictionary) {
        int cont = dataDictionaryMapper.updateByPrimaryKeySelective(dataDictionary);

        return cont;
    }

    /**
     * id删除
     * @param id
     * @return
     */
    @Override
    public int deleteDic(Long id) {
        int i = dataDictionaryMapper.deleteByPrimaryKey(id);

        return i;
    }

    /**
     * id查询
     * @param id
     * @return
     */
    @Override
    public DataDictionary selectById(Long id) {
        DataDictionary dataDictionary = dataDictionaryMapper.selectByPrimaryKey(id);
        return dataDictionary;
    }
}
