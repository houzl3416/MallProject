package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsHomeSubjectSpu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 专题商品(SmsHomeSubjectSpu)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsHomeSubjectSpuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsHomeSubjectSpu queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsHomeSubjectSpu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsHomeSubjectSpu> queryByPage(SmsHomeSubjectSpu smsHomeSubjectSpu, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    SmsHomeSubjectSpu insert(SmsHomeSubjectSpu smsHomeSubjectSpu);

    /**
     * 修改数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    SmsHomeSubjectSpu update(SmsHomeSubjectSpu smsHomeSubjectSpu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
