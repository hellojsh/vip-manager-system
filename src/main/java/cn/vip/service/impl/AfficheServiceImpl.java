package cn.vip.service.impl;

import cn.vip.mapper.AfficheMapper;
import cn.vip.pojo.Affiche;
import cn.vip.pojo.AfficheExample;
import cn.vip.service.AfficheService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AfficheServiceImpl implements AfficheService {

    @Resource
    private AfficheMapper afficheMapper;

    /**
     * 查询所有公告
     *
     * @return
     */
    @Override
    public List<Affiche> findAllAffiche() {
        AfficheExample afficheExample = new AfficheExample();
        List<Affiche> afficheList = afficheMapper.selectByExample(afficheExample);
        return afficheList;
    }

    /**
     * 通过id查询公告详情
     *
     * @param id
     * @return
     */
    @Override
    public Affiche findAfficheById(Long id) {
        Affiche affiche = afficheMapper.selectByPrimaryKey(id);
        return affiche;
    }

    /**
     * 查询所有公告（分页）
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public List<Affiche> findAllAfficheByPage(Integer pageNo, Integer pageSize) {
        pageNo = (pageNo - 1) * pageSize;
        List<Affiche> informationList = afficheMapper.selectByPage(pageNo, pageSize);
        return informationList;
    }

    /**
     * 查询总记录数
     *
     * @return
     */
    @Override
    public int findCount() {
        AfficheExample afficheExample = new AfficheExample();
        int count = afficheMapper.countByExample(afficheExample);
        return count;
    }

    /**
     * 根据id删除公告
     *
     * @param id
     * @return
     */
    @Override
    public boolean delAuAfficheById(Long id) {
        int result = afficheMapper.deleteByPrimaryKey(id);

        if (result > 0) {
            return true;
        }
        return false;
    }


}
