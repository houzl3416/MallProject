package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsHomeSubject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsHomeSubjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsHomeSubject queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsHomeSubject 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsHomeSubject> queryByPage(SmsHomeSubject smsHomeSubject, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    SmsHomeSubject insert(SmsHomeSubject smsHomeSubject);

    /**
     * 修改数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    SmsHomeSubject update(SmsHomeSubject smsHomeSubject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
