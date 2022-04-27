package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsCoupon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 优惠券信息(SmsCoupon)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsCouponService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsCoupon queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsCoupon 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsCoupon> queryByPage(SmsCoupon smsCoupon, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsCoupon 实例对象
     * @return 实例对象
     */
    SmsCoupon insert(SmsCoupon smsCoupon);

    /**
     * 修改数据
     *
     * @param smsCoupon 实例对象
     * @return 实例对象
     */
    SmsCoupon update(SmsCoupon smsCoupon);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
