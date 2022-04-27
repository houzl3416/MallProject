package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsSkuFullReduction;
import com.project.mall.coupon.dao.SmsSkuFullReductionDao;
import com.project.mall.coupon.service.SmsSkuFullReductionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品满减信息(SmsSkuFullReduction)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsSkuFullReductionService")
public class SmsSkuFullReductionServiceImpl implements SmsSkuFullReductionService {
    @Resource
    private SmsSkuFullReductionDao smsSkuFullReductionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction queryById(Long id) {
        return this.smsSkuFullReductionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsSkuFullReduction 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsSkuFullReduction> queryByPage(SmsSkuFullReduction smsSkuFullReduction, PageRequest pageRequest) {
        long total = this.smsSkuFullReductionDao.count(smsSkuFullReduction);
        return new PageImpl<>(this.smsSkuFullReductionDao.queryAllByLimit(smsSkuFullReduction, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction insert(SmsSkuFullReduction smsSkuFullReduction) {
        this.smsSkuFullReductionDao.insert(smsSkuFullReduction);
        return smsSkuFullReduction;
    }

    /**
     * 修改数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction update(SmsSkuFullReduction smsSkuFullReduction) {
        this.smsSkuFullReductionDao.update(smsSkuFullReduction);
        return this.queryById(smsSkuFullReduction.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSkuFullReductionDao.deleteById(id) > 0;
    }
}
