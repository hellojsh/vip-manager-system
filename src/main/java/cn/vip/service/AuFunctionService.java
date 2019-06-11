package cn.vip.service;

import cn.vip.pojo.AuAuthority;
import cn.vip.pojo.AuFunction;

import java.util.List;

/**
 * 查询当前菜单
 *
 * @author Taeyeon
 * @createTime 2019-06-10-17:19
 */
public interface AuFunctionService {

    List<AuFunction> getMainFunctionList(AuAuthority auAuthority) throws Exception;

    List<AuFunction> getSubFunctionList(AuFunction auFunction) throws Exception;
}
