package cn.vip.service.impl;

import cn.vip.mapper.AuUserMapper;
import cn.vip.pojo.AuUser;
import cn.vip.pojo.AuUserExample;
import cn.vip.service.AuUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AuUserServiceImpl implements AuUserService {
    @Resource
    private AuUserMapper auUserMapper;

    /**
     * 登陆
     * @param logincode
     * @return
     */
    @Override
    public AuUser loginDo(String logincode) {
        AuUserExample auUserExample = new AuUserExample();
        AuUserExample.Criteria criteria = auUserExample.createCriteria();
        criteria.andLogincodeEqualTo(logincode);
        List<AuUser> auUserList = auUserMapper.selectByExample(auUserExample);
        if(auUserList.size() <= 0) {
            return null;
        }
        return auUserList.get(0);
    }
}
