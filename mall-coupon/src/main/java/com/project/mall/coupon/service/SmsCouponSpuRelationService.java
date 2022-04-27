package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsCouponSpuRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsCouponSpuRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsCouponSpuRelation queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsCouponSpuRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsCouponSpuRelation> queryByPage(SmsCouponSpuRelation smsCouponSpuRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    SmsCouponSpuRelation insert(SmsCouponSpuRelation smsCouponSpuRelation);

    /**
     * 修改数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    SmsCouponSpuRelation update(SmsCouponSpuRelation smsCouponSpuRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
