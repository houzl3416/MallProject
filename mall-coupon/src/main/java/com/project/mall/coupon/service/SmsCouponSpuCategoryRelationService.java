package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsCouponSpuCategoryRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsCouponSpuCategoryRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsCouponSpuCategoryRelation queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsCouponSpuCategoryRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsCouponSpuCategoryRelation> queryByPage(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsCouponSpuCategoryRelation 实例对象
     * @return 实例对象
     */
    SmsCouponSpuCategoryRelation insert(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation);

    /**
     * 修改数据
     *
     * @param smsCouponSpuCategoryRelation 实例对象
     * @return 实例对象
     */
    SmsCouponSpuCategoryRelation update(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
