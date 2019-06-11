package cn.vip.service.impl;

import cn.vip.mapper.AuFunctionMapper;
import cn.vip.pojo.AuAuthority;
import cn.vip.pojo.AuFunction;
import cn.vip.service.AuFunctionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Taeyeon
 * @createTime 2019-06-10-17:19
 */

@Service
public class AuFunctionServiceImpl implements AuFunctionService {

    @Resource
    private AuFunctionMapper auFunctionMapper;


    @Override
    public List<AuFunction> getMainFunctionList(AuAuthority auAuthority) throws Exception {
        return auFunctionMapper.getMainFunctionList(auAuthority);
    }

    @Override
    public List<AuFunction> getSubFunctionList(AuFunction auFunction) throws Exception {
        return auFunctionMapper.getSubFunctionList(auFunction);
    }
}
