package cn.vip.service.impl;

import cn.vip.mapper.InformationMapper;
import cn.vip.pojo.Information;
import cn.vip.pojo.InformationExample;
import cn.vip.service.InfomationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfomationServiceImpl implements InfomationService {

    @Resource
    private InformationMapper informationMapper;


    @Override
    public List<Information> findAllInfomation() {

        InformationExample informationExample = new InformationExample();
        List<Information> information = informationMapper.selectByExample(informationExample);
        return information;

    }

    @Override
    public Information findInfomationById(Long id) {
        Information information = informationMapper.selectByPrimaryKey(id);
        return information;
    }
}
