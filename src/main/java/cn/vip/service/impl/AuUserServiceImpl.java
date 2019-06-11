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
     *
     * @param logincode
     * @return
     */
    @Override
    public AuUser loginDo(String logincode) {
        AuUserExample auUserExample = new AuUserExample();
        AuUserExample.Criteria criteria = auUserExample.createCriteria();
        criteria.andLoginCodeEqualTo(logincode);
        List<AuUser> auUserList = auUserMapper.selectByExample(auUserExample);
        if (auUserList.size() <= 0) {
            return null;
        }
        return auUserList.get(0);
    }

    /**
     * 根据id查询查询用户信息
     *
     * @param id
     * @return
     */
    @Override
    public AuUser findUserById(Long id) {
        AuUser auUser = null;
        auUser = auUserMapper.selectByPrimaryKey(id);
        return auUser;
    }

    /**
     * 根据id修改用户密码
     *
     * @param id
     * @param password
     * @return
     */
    @Override
    public boolean updatePasswordById(Long id, String password, String password2) {
        boolean flag = false;

        AuUser user = new AuUser();
        user.setId(id);
        user.setPassword(password);
        user.setPassword2(password2);

        int result = auUserMapper.updateByPrimaryKeySelective(user);

        if (result > 0) {
            flag = true;
        }

        return flag;
    }
}
