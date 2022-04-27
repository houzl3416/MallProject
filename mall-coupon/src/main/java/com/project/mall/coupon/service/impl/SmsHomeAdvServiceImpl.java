package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsHomeAdv;
import com.project.mall.coupon.dao.SmsHomeAdvDao;
import com.project.mall.coupon.service.SmsHomeAdvService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 首页轮播广告(SmsHomeAdv)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl implements SmsHomeAdvService {
    @Resource
    private SmsHomeAdvDao smsHomeAdvDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv queryById(Long id) {
        return this.smsHomeAdvDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsHomeAdv 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsHomeAdv> queryByPage(SmsHomeAdv smsHomeAdv, PageRequest pageRequest) {
        long total = this.smsHomeAdvDao.count(smsHomeAdv);
        return new PageImpl<>(this.smsHomeAdvDao.queryAllByLimit(smsHomeAdv, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsHomeAdv 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv insert(SmsHomeAdv smsHomeAdv) {
        this.smsHomeAdvDao.insert(smsHomeAdv);
        return smsHomeAdv;
    }

    /**
     * 修改数据
     *
     * @param smsHomeAdv 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv update(SmsHomeAdv smsHomeAdv) {
        this.smsHomeAdvDao.update(smsHomeAdv);
        return this.queryById(smsHomeAdv.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeAdvDao.deleteById(id) > 0;
    }
}
