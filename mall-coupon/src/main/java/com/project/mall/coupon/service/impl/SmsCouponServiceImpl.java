package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsCoupon;
import com.project.mall.coupon.dao.SmsCouponDao;
import com.project.mall.coupon.service.SmsCouponService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 优惠券信息(SmsCoupon)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsCouponService")
public class SmsCouponServiceImpl implements SmsCouponService {
    @Resource
    private SmsCouponDao smsCouponDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCoupon queryById(Long id) {
        return this.smsCouponDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsCoupon 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsCoupon> queryByPage(SmsCoupon smsCoupon, PageRequest pageRequest) {
        long total = this.smsCouponDao.count(smsCoupon);
        return new PageImpl<>(this.smsCouponDao.queryAllByLimit(smsCoupon, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsCoupon 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCoupon insert(SmsCoupon smsCoupon) {
        this.smsCouponDao.insert(smsCoupon);
        return smsCoupon;
    }

    /**
     * 修改数据
     *
     * @param smsCoupon 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCoupon update(SmsCoupon smsCoupon) {
        this.smsCouponDao.update(smsCoupon);
        return this.queryById(smsCoupon.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponDao.deleteById(id) > 0;
    }
}
