package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsHomeSubjectSpu;
import com.project.mall.coupon.dao.SmsHomeSubjectSpuDao;
import com.project.mall.coupon.service.SmsHomeSubjectSpuService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 专题商品(SmsHomeSubjectSpu)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsHomeSubjectSpuService")
public class SmsHomeSubjectSpuServiceImpl implements SmsHomeSubjectSpuService {
    @Resource
    private SmsHomeSubjectSpuDao smsHomeSubjectSpuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu queryById(Long id) {
        return this.smsHomeSubjectSpuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsHomeSubjectSpu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsHomeSubjectSpu> queryByPage(SmsHomeSubjectSpu smsHomeSubjectSpu, PageRequest pageRequest) {
        long total = this.smsHomeSubjectSpuDao.count(smsHomeSubjectSpu);
        return new PageImpl<>(this.smsHomeSubjectSpuDao.queryAllByLimit(smsHomeSubjectSpu, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu insert(SmsHomeSubjectSpu smsHomeSubjectSpu) {
        this.smsHomeSubjectSpuDao.insert(smsHomeSubjectSpu);
        return smsHomeSubjectSpu;
    }

    /**
     * 修改数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu update(SmsHomeSubjectSpu smsHomeSubjectSpu) {
        this.smsHomeSubjectSpuDao.update(smsHomeSubjectSpu);
        return this.queryById(smsHomeSubjectSpu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeSubjectSpuDao.deleteById(id) > 0;
    }
}
