package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsMemberPrice;
import com.project.mall.coupon.dao.SmsMemberPriceDao;
import com.project.mall.coupon.service.SmsMemberPriceService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品会员价格(SmsMemberPrice)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl implements SmsMemberPriceService {
    @Resource
    private SmsMemberPriceDao smsMemberPriceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice queryById(Long id) {
        return this.smsMemberPriceDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsMemberPrice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsMemberPrice> queryByPage(SmsMemberPrice smsMemberPrice, PageRequest pageRequest) {
        long total = this.smsMemberPriceDao.count(smsMemberPrice);
        return new PageImpl<>(this.smsMemberPriceDao.queryAllByLimit(smsMemberPrice, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice insert(SmsMemberPrice smsMemberPrice) {
        this.smsMemberPriceDao.insert(smsMemberPrice);
        return smsMemberPrice;
    }

    /**
     * 修改数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice update(SmsMemberPrice smsMemberPrice) {
        this.smsMemberPriceDao.update(smsMemberPrice);
        return this.queryById(smsMemberPrice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsMemberPriceDao.deleteById(id) > 0;
    }
}
