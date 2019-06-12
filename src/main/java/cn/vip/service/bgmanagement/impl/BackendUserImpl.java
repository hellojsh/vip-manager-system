package cn.vip.service.bgmanagement.impl;

import cn.vip.mapper.AuRoleMapper;
import cn.vip.mapper.AuUserMapper;
import cn.vip.mapper.DataDictionaryMapper;
import cn.vip.pojo.*;
import cn.vip.service.bgmanagement.BackendUser;
import cn.vip.utils.PageSupport;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chai
 * @version 1.0.0
 * <p>
 * BgUser的实现类
 * @create 2019/6/10
 */
@Service
public class BackendUserImpl implements BackendUser {
    @Resource
    private AuUserMapper auUserMapper;
    @Resource
    private AuRoleMapper auRoleMapper;
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    @Override
    public List<Object> bgLimitUser(Integer pageNo) {
        ArrayList<Object> list = new ArrayList<>();

        PageSupport page = new PageSupport();
        // 设置当前页
        if (pageNo != null) {
            page.setPage(pageNo);
        }
        // 设置page的items
        page.setItems(auUserMapper.selectByExampleLimit((page.getPage() - 1) * page.getPageSize(), page.getPageSize()));
        // 设置总得记录数
        page.setTotalCount(auUserMapper.countByExample(new AuUserExample()));
        // 获取所有的角色
        List<AuRole> allRole = auRoleMapper.selectByExample(new AuRoleExample());

        list.add(page);
        list.add(allRole);

        return list;
    }

    @Override
    public AuUser selectByPrimaryKey(Long id) {
        AuUser auUser = auUserMapper.selectByPrimaryKey(id);

        return auUser;
    }

    @Override
    public List<DataDictionary> selectByExampleUser() {
        DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = dataDictionaryExample.createCriteria();
        criteria.andTypeCodeEqualTo("USER_TYPE");
        List<DataDictionary> dataDictionaries = dataDictionaryMapper.selectByExample(dataDictionaryExample);

        return dataDictionaries;
    }

    @Override
    public List<DataDictionary> selectByExampleCard() {
        DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = dataDictionaryExample.createCriteria();
        criteria.andTypeCodeEqualTo("CARD_TYPE");
        List<DataDictionary> dataDictionaries = dataDictionaryMapper.selectByExample(dataDictionaryExample);

        return dataDictionaries;
    }

    @Override
    public String selectByExampleLoginCode(String loginCode, Long id) {
        AuUserExample auUserExample = new AuUserExample();
        AuUserExample.Criteria criteria = auUserExample.createCriteria();
        criteria.andLoginCodeEqualTo(loginCode);
        List<AuUser> auUsers = auUserMapper.selectByExample(auUserExample);

        // 判断是否重复
        String flag = null;
        if (auUsers.size() != 0) {
            flag = "repeat";
        } else {
            flag = "only";
        }

        return flag;
    }

    @Override
    public String deleteByPrimaryKey(Long id) {
        int delete = auUserMapper.deleteByPrimaryKey(id);

        // 判断是否删除
        String flag = null;
        if (delete > 0) {
            flag = "success";
        } else {
            flag = "noallow";
        }

        return flag;
    }

}
