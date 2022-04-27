package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsHomeSubject;
import com.project.mall.coupon.dao.SmsHomeSubjectDao;
import com.project.mall.coupon.service.SmsHomeSubjectService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl implements SmsHomeSubjectService {
    @Resource
    private SmsHomeSubjectDao smsHomeSubjectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject queryById(Long id) {
        return this.smsHomeSubjectDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsHomeSubject 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsHomeSubject> queryByPage(SmsHomeSubject smsHomeSubject, PageRequest pageRequest) {
        long total = this.smsHomeSubjectDao.count(smsHomeSubject);
        return new PageImpl<>(this.smsHomeSubjectDao.queryAllByLimit(smsHomeSubject, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject insert(SmsHomeSubject smsHomeSubject) {
        this.smsHomeSubjectDao.insert(smsHomeSubject);
        return smsHomeSubject;
    }

    /**
     * 修改数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject update(SmsHomeSubject smsHomeSubject) {
        this.smsHomeSubjectDao.update(smsHomeSubject);
        return this.queryById(smsHomeSubject.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeSubjectDao.deleteById(id) > 0;
    }
}
