package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsSeckillSkuRelation;
import com.project.mall.coupon.dao.SmsSeckillSkuRelationDao;
import com.project.mall.coupon.service.SmsSeckillSkuRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl implements SmsSeckillSkuRelationService {
    @Resource
    private SmsSeckillSkuRelationDao smsSeckillSkuRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation queryById(Long id) {
        return this.smsSeckillSkuRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsSeckillSkuRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsSeckillSkuRelation> queryByPage(SmsSeckillSkuRelation smsSeckillSkuRelation, PageRequest pageRequest) {
        long total = this.smsSeckillSkuRelationDao.count(smsSeckillSkuRelation);
        return new PageImpl<>(this.smsSeckillSkuRelationDao.queryAllByLimit(smsSeckillSkuRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation insert(SmsSeckillSkuRelation smsSeckillSkuRelation) {
        this.smsSeckillSkuRelationDao.insert(smsSeckillSkuRelation);
        return smsSeckillSkuRelation;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation update(SmsSeckillSkuRelation smsSeckillSkuRelation) {
        this.smsSeckillSkuRelationDao.update(smsSeckillSkuRelation);
        return this.queryById(smsSeckillSkuRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillSkuRelationDao.deleteById(id) > 0;
    }
}
