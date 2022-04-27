package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsSpuBounds;
import com.project.mall.coupon.dao.SmsSpuBoundsDao;
import com.project.mall.coupon.service.SmsSpuBoundsService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品spu积分设置(SmsSpuBounds)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:05
 */
@Service("smsSpuBoundsService")
public class SmsSpuBoundsServiceImpl implements SmsSpuBoundsService {
    @Resource
    private SmsSpuBoundsDao smsSpuBoundsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSpuBounds queryById(Long id) {
        return this.smsSpuBoundsDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsSpuBounds 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsSpuBounds> queryByPage(SmsSpuBounds smsSpuBounds, PageRequest pageRequest) {
        long total = this.smsSpuBoundsDao.count(smsSpuBounds);
        return new PageImpl<>(this.smsSpuBoundsDao.queryAllByLimit(smsSpuBounds, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsSpuBounds 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSpuBounds insert(SmsSpuBounds smsSpuBounds) {
        this.smsSpuBoundsDao.insert(smsSpuBounds);
        return smsSpuBounds;
    }

    /**
     * 修改数据
     *
     * @param smsSpuBounds 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSpuBounds update(SmsSpuBounds smsSpuBounds) {
        this.smsSpuBoundsDao.update(smsSpuBounds);
        return this.queryById(smsSpuBounds.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSpuBoundsDao.deleteById(id) > 0;
    }
}
