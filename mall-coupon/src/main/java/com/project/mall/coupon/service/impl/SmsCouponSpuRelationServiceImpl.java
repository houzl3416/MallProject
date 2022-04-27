package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsCouponSpuRelation;
import com.project.mall.coupon.dao.SmsCouponSpuRelationDao;
import com.project.mall.coupon.service.SmsCouponSpuRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl implements SmsCouponSpuRelationService {
    @Resource
    private SmsCouponSpuRelationDao smsCouponSpuRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation queryById(Long id) {
        return this.smsCouponSpuRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsCouponSpuRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsCouponSpuRelation> queryByPage(SmsCouponSpuRelation smsCouponSpuRelation, PageRequest pageRequest) {
        long total = this.smsCouponSpuRelationDao.count(smsCouponSpuRelation);
        return new PageImpl<>(this.smsCouponSpuRelationDao.queryAllByLimit(smsCouponSpuRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation insert(SmsCouponSpuRelation smsCouponSpuRelation) {
        this.smsCouponSpuRelationDao.insert(smsCouponSpuRelation);
        return smsCouponSpuRelation;
    }

    /**
     * 修改数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation update(SmsCouponSpuRelation smsCouponSpuRelation) {
        this.smsCouponSpuRelationDao.update(smsCouponSpuRelation);
        return this.queryById(smsCouponSpuRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponSpuRelationDao.deleteById(id) > 0;
    }
}
