package cn.vip.service;

import cn.vip.pojo.AuUser;

/**
 * 用户接口
 */
public interface AuUserService {
    /**
     * 用户登陆
     * @param logincode
     * @return
     */
    AuUser loginDo(String logincode);
}
