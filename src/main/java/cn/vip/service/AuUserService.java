package cn.vip.service;

import cn.vip.pojo.AuUser;

/**
 * 用户接口
 */
public interface AuUserService {
    /**
     * 用户登陆
     *
     * @param logincode
     * @return
     */
    AuUser loginDo(String logincode);

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    AuUser findUserById(Long id);

    /**
     * 根据id修改密码
     *
     * @param id
     * @param password
     * @return
     */
    boolean updatePasswordById(Long id, String password, String password2);
    /**
     * 用户注册
     * @param auUser
     * @return
     */
    int auUserRegister(AuUser auUser);

    /**
     * 根据用户（登陆的用户名）名查询用户
     * @param loginCode
     * @return
     */
    AuUser selectByLoginCode(String loginCode);
}
