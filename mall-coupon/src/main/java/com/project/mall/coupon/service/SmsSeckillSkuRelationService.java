package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsSeckillSkuRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsSeckillSkuRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSeckillSkuRelation queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsSeckillSkuRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsSeckillSkuRelation> queryByPage(SmsSeckillSkuRelation smsSeckillSkuRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuRelation insert(SmsSeckillSkuRelation smsSeckillSkuRelation);

    /**
     * 修改数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuRelation update(SmsSeckillSkuRelation smsSeckillSkuRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
