package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsCouponSpuCategoryRelation;
import com.project.mall.coupon.dao.SmsCouponSpuCategoryRelationDao;
import com.project.mall.coupon.service.SmsCouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl implements SmsCouponSpuCategoryRelationService {
    @Resource
    private SmsCouponSpuCategoryRelationDao smsCouponSpuCategoryRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation queryById(Long id) {
        return this.smsCouponSpuCategoryRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsCouponSpuCategoryRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsCouponSpuCategoryRelation> queryByPage(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation, PageRequest pageRequest) {
        long total = this.smsCouponSpuCategoryRelationDao.count(smsCouponSpuCategoryRelation);
        return new PageImpl<>(this.smsCouponSpuCategoryRelationDao.queryAllByLimit(smsCouponSpuCategoryRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsCouponSpuCategoryRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation insert(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        this.smsCouponSpuCategoryRelationDao.insert(smsCouponSpuCategoryRelation);
        return smsCouponSpuCategoryRelation;
    }

    /**
     * 修改数据
     *
     * @param smsCouponSpuCategoryRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation update(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        this.smsCouponSpuCategoryRelationDao.update(smsCouponSpuCategoryRelation);
        return this.queryById(smsCouponSpuCategoryRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponSpuCategoryRelationDao.deleteById(id) > 0;
    }
}
