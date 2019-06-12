package cn.vip.service;

import cn.vip.pojo.AuUser;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author hellojsh
 * @create 2019-06-10 16:11
 */
public interface MemberService {
    List<AuUser> getAuUserList();

    AuUser getAuUserById(Long id);

    int updateAuUser(AuUser auUser);

}
