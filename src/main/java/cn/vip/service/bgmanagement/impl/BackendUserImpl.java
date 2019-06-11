package cn.vip.service.bgmanagement.impl;

import cn.vip.mapper.AuUserMapper;
import cn.vip.pojo.AuUserExample;
import cn.vip.service.bgmanagement.BackendUser;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    @Override
    public PageSupport bgAllUser() {
        PageSupport page = new PageSupport();
        // 设置page的items
        page.setItems(auUserMapper.selectByExample(new AuUserExample()));
        // 设置总得记录数
        page.setTotalCount(auUserMapper.countByExample(new AuUserExample()));

        return page;
    }
}
