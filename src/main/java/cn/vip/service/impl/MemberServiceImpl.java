package cn.vip.service.impl;

import cn.vip.mapper.AuUserMapper;
import cn.vip.pojo.AuUser;
import cn.vip.pojo.AuUserExample;
import cn.vip.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hellojsh
 * @create 2019-06-10 16:11
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private AuUserMapper auUserMapper;

    /**
     * 查询所有的会员信息
     * @return
     */
    @Override
    public List<AuUser> getAuUserList() {
        AuUserExample example = new AuUserExample();
        AuUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserTypeIsNotNull();
        criteria.andUserTypeNotEqualTo("");
        return auUserMapper.selectByExample(example);
    }

    /**
     * 根据主键查询会员信息
     * @param id
     * @return
     */
    @Override
    public AuUser getAuUserById(Long id) {
        return auUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新用户信息
     * @param auUser
     */
    @Transactional
    @Override
    public void updateAuUser(AuUser auUser) {

    }
}
