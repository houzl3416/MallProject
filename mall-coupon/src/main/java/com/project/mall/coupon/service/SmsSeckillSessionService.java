package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsSeckillSession;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 秒杀活动场次(SmsSeckillSession)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsSeckillSessionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSeckillSession queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsSeckillSession 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsSeckillSession> queryByPage(SmsSeckillSession smsSeckillSession, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsSeckillSession 实例对象
     * @return 实例对象
     */
    SmsSeckillSession insert(SmsSeckillSession smsSeckillSession);

    /**
     * 修改数据
     *
     * @param smsSeckillSession 实例对象
     * @return 实例对象
     */
    SmsSeckillSession update(SmsSeckillSession smsSeckillSession);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
