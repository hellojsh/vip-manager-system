package cn.vip.service.bgmanagement.impl;

import cn.vip.mapper.AuRoleMapper;
import cn.vip.mapper.AuUserMapper;
import cn.vip.pojo.AuRole;
import cn.vip.pojo.AuRoleExample;
import cn.vip.pojo.AuUserExample;
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
}
