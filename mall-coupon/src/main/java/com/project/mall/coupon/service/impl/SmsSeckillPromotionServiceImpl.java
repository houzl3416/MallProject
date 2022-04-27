package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsSeckillPromotion;
import com.project.mall.coupon.dao.SmsSeckillPromotionDao;
import com.project.mall.coupon.service.SmsSeckillPromotionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 秒杀活动(SmsSeckillPromotion)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsSeckillPromotionService")
public class SmsSeckillPromotionServiceImpl implements SmsSeckillPromotionService {
    @Resource
    private SmsSeckillPromotionDao smsSeckillPromotionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion queryById(Long id) {
        return this.smsSeckillPromotionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsSeckillPromotion 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsSeckillPromotion> queryByPage(SmsSeckillPromotion smsSeckillPromotion, PageRequest pageRequest) {
        long total = this.smsSeckillPromotionDao.count(smsSeckillPromotion);
        return new PageImpl<>(this.smsSeckillPromotionDao.queryAllByLimit(smsSeckillPromotion, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillPromotion 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion insert(SmsSeckillPromotion smsSeckillPromotion) {
        this.smsSeckillPromotionDao.insert(smsSeckillPromotion);
        return smsSeckillPromotion;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillPromotion 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion update(SmsSeckillPromotion smsSeckillPromotion) {
        this.smsSeckillPromotionDao.update(smsSeckillPromotion);
        return this.queryById(smsSeckillPromotion.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillPromotionDao.deleteById(id) > 0;
    }
}
