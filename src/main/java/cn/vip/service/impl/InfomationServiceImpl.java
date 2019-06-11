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

    /**
     * 分页查询
     * @return
     */
    @Override
    public List<Information> findAllInfomationByPage(Integer pageNo,Integer pageSize) {
        pageNo = (pageNo-1)*pageSize;
        List<Information> information = informationMapper.selectByPage(pageNo, pageSize);

        return information;
    }

    /**
     * 查询总记录数
     * @return
     */
    @Override
    public int findCount() {
        InformationExample informationExample = new InformationExample();
        int count = informationMapper.countByExample(informationExample);
        return count;
    }
}
