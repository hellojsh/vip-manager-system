package cn.vip.service;

import cn.vip.pojo.AuUser;

import java.util.List;

/**
 * @author hellojsh
 * @create 2019-06-10 16:11
 */
public interface MemberService {
    List<AuUser> getAuUserList();

    AuUser getAuUserById(Long id);

    void updateAuUser(AuUser auUser);
}
