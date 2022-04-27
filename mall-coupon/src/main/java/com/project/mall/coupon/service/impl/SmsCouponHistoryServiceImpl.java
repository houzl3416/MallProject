package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsCouponHistory;
import com.project.mall.coupon.dao.SmsCouponHistoryDao;
import com.project.mall.coupon.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {
    @Resource
    private SmsCouponHistoryDao smsCouponHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory queryById(Long id) {
        return this.smsCouponHistoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsCouponHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsCouponHistory> queryByPage(SmsCouponHistory smsCouponHistory, PageRequest pageRequest) {
        long total = this.smsCouponHistoryDao.count(smsCouponHistory);
        return new PageImpl<>(this.smsCouponHistoryDao.queryAllByLimit(smsCouponHistory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsCouponHistory 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory insert(SmsCouponHistory smsCouponHistory) {
        this.smsCouponHistoryDao.insert(smsCouponHistory);
        return smsCouponHistory;
    }

    /**
     * 修改数据
     *
     * @param smsCouponHistory 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory update(SmsCouponHistory smsCouponHistory) {
        this.smsCouponHistoryDao.update(smsCouponHistory);
        return this.queryById(smsCouponHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponHistoryDao.deleteById(id) > 0;
    }
}
