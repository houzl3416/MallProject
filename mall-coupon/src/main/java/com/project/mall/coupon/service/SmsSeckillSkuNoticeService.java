package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsSeckillSkuNotice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsSeckillSkuNoticeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSeckillSkuNotice queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsSeckillSkuNotice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsSeckillSkuNotice> queryByPage(SmsSeckillSkuNotice smsSeckillSkuNotice, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuNotice insert(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * 修改数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuNotice update(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
