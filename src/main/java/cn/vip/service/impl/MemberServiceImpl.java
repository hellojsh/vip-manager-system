package cn.vip.service.impl;

import cn.vip.mapper.AuUserMapper;
import cn.vip.mapper.DataDictionaryMapper;
import cn.vip.pojo.AuUser;
import cn.vip.pojo.AuUserExample;
import cn.vip.pojo.DataDictionary;
import cn.vip.pojo.DataDictionaryExample;
import cn.vip.service.MemberService;
import cn.vip.utils.Constants;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * @author hellojsh
 * @create 2019-06-10 16:11
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private AuUserMapper auUserMapper;
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    /**
     * 查询所有的会员信息
     * @return 所有会员集合
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
     * @param id 会员id
     * @return 会员对象
     */
    @Override
    public AuUser getAuUserById(Long id) {
        return auUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新用户信息
     * @param auUser 更新的条数
     */
    @Transactional
    @Override
    public int updateAuUser(AuUser auUser) {
        // 根据当前修改的会员id从数据库中查找对应的记录
        AuUser oldAuUser = auUserMapper.selectByPrimaryKey(auUser.getId());
        auUser.setPassword(oldAuUser.getPassword());
        auUser.setPassword2(oldAuUser.getPassword2());
        auUser.setReferId(oldAuUser.getReferId());
        auUser.setReferCode(oldAuUser.getReferCode());
        auUser.setRoleId(oldAuUser.getRoleId());
        auUser.setLastUpdateTime(oldAuUser.getLastUpdateTime());
        auUser.setLastLoginTime(oldAuUser.getLastLoginTime());


        // 首先根据该用户的用户类型id查询其用户类型值
        DataDictionaryExample exampleUserType = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteriaUserType = exampleUserType.createCriteria();
        // 查询所有的用户类型
        criteriaUserType.andTypeCodeEqualTo(Constants.DATA_DICTIONARY_USER_TYPE_CODE);
        // 在所有的用户类型中查询与 该会员 的用户类型值相同的 valueId
        criteriaUserType.andValueIdEqualTo(Integer.parseInt(auUser.getUserType()));
        // 此处从用户字典中查询出的字典对象只有一个
        List<DataDictionary> dataDictionariesUserTypeList = dataDictionaryMapper.selectByExample(exampleUserType);

        // 根据该用户的证件类型 id 查询其用户的证件类型值
        DataDictionaryExample exampleCardType = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteriaCardType = exampleCardType.createCriteria();
        // 查询所有的证件类型
        criteriaCardType.andTypeCodeEqualTo(Constants.DATA_DICTIONARY_CARD_TYPE_CODE);
        // 在所有证件类型中查询与该会员的 证件类型id 相同的 valueId
        criteriaCardType.andValueIdEqualTo(Integer.parseInt(auUser.getCardType()));
        List<DataDictionary> dataDictionariesCardTypeList = dataDictionaryMapper.selectByExample(exampleCardType);

        // 设置该用户的用户类型值与查询出的用户类型值相同
        auUser.setUserTypeName(dataDictionariesUserTypeList.get(0).getValueName());
        // 设置该用户的证件类型与查出的证件类型值相同
        auUser.setCardTypeName(dataDictionariesCardTypeList.get(0).getValueName());

        return auUserMapper.updateByPrimaryKey(auUser);
    }
}
