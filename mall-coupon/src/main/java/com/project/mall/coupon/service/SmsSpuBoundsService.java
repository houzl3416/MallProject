package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsSpuBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品spu积分设置(SmsSpuBounds)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsSpuBoundsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSpuBounds queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsSpuBounds 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsSpuBounds> queryByPage(SmsSpuBounds smsSpuBounds, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsSpuBounds 实例对象
     * @return 实例对象
     */
    SmsSpuBounds insert(SmsSpuBounds smsSpuBounds);

    /**
     * 修改数据
     *
     * @param smsSpuBounds 实例对象
     * @return 实例对象
     */
    SmsSpuBounds update(SmsSpuBounds smsSpuBounds);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
