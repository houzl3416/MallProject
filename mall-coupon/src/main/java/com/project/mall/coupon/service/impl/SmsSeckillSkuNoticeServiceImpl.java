package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsSeckillSkuNotice;
import com.project.mall.coupon.dao.SmsSeckillSkuNoticeDao;
import com.project.mall.coupon.service.SmsSeckillSkuNoticeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl implements SmsSeckillSkuNoticeService {
    @Resource
    private SmsSeckillSkuNoticeDao smsSeckillSkuNoticeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuNotice queryById(Long id) {
        return this.smsSeckillSkuNoticeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsSeckillSkuNotice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsSeckillSkuNotice> queryByPage(SmsSeckillSkuNotice smsSeckillSkuNotice, PageRequest pageRequest) {
        long total = this.smsSeckillSkuNoticeDao.count(smsSeckillSkuNotice);
        return new PageImpl<>(this.smsSeckillSkuNoticeDao.queryAllByLimit(smsSeckillSkuNotice, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuNotice insert(SmsSeckillSkuNotice smsSeckillSkuNotice) {
        this.smsSeckillSkuNoticeDao.insert(smsSeckillSkuNotice);
        return smsSeckillSkuNotice;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuNotice update(SmsSeckillSkuNotice smsSeckillSkuNotice) {
        this.smsSeckillSkuNoticeDao.update(smsSeckillSkuNotice);
        return this.queryById(smsSeckillSkuNotice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillSkuNoticeDao.deleteById(id) > 0;
    }
}
