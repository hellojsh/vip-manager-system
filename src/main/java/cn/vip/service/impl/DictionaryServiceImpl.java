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


    @Override
    public List<DataDictionary> selectBy(String typecode) {
        DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = dataDictionaryExample.createCriteria();
        criteria.andTypeCodeEqualTo(typecode);
        List<DataDictionary> dictionaryList = dataDictionaryMapper.selectByExample(dataDictionaryExample);
        return dictionaryList;

    }
}
