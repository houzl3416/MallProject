package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsMemberCollectSpu;
import com.project.mall.member.dao.UmsMemberCollectSpuDao;
import com.project.mall.member.service.UmsMemberCollectSpuService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl implements UmsMemberCollectSpuService {
    @Resource
    private UmsMemberCollectSpuDao umsMemberCollectSpuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu queryById(Long id) {
        return this.umsMemberCollectSpuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsMemberCollectSpu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsMemberCollectSpu> queryByPage(UmsMemberCollectSpu umsMemberCollectSpu, PageRequest pageRequest) {
        long total = this.umsMemberCollectSpuDao.count(umsMemberCollectSpu);
        return new PageImpl<>(this.umsMemberCollectSpuDao.queryAllByLimit(umsMemberCollectSpu, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu insert(UmsMemberCollectSpu umsMemberCollectSpu) {
        this.umsMemberCollectSpuDao.insert(umsMemberCollectSpu);
        return umsMemberCollectSpu;
    }

    /**
     * 修改数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu update(UmsMemberCollectSpu umsMemberCollectSpu) {
        this.umsMemberCollectSpuDao.update(umsMemberCollectSpu);
        return this.queryById(umsMemberCollectSpu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberCollectSpuDao.deleteById(id) > 0;
    }
}
