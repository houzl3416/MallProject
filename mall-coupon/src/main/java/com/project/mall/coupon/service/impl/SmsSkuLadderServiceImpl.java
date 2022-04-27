package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsSkuLadder;
import com.project.mall.coupon.dao.SmsSkuLadderDao;
import com.project.mall.coupon.service.SmsSkuLadderService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品阶梯价格(SmsSkuLadder)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsSkuLadderService")
public class SmsSkuLadderServiceImpl implements SmsSkuLadderService {
    @Resource
    private SmsSkuLadderDao smsSkuLadderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder queryById(Long id) {
        return this.smsSkuLadderDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsSkuLadder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsSkuLadder> queryByPage(SmsSkuLadder smsSkuLadder, PageRequest pageRequest) {
        long total = this.smsSkuLadderDao.count(smsSkuLadder);
        return new PageImpl<>(this.smsSkuLadderDao.queryAllByLimit(smsSkuLadder, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsSkuLadder 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder insert(SmsSkuLadder smsSkuLadder) {
        this.smsSkuLadderDao.insert(smsSkuLadder);
        return smsSkuLadder;
    }

    /**
     * 修改数据
     *
     * @param smsSkuLadder 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder update(SmsSkuLadder smsSkuLadder) {
        this.smsSkuLadderDao.update(smsSkuLadder);
        return this.queryById(smsSkuLadder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSkuLadderDao.deleteById(id) > 0;
    }
}
