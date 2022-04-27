package com.project.mall.ware.service.impl;

import com.project.mall.ware.entity.WmsPurchase;
import com.project.mall.ware.dao.WmsPurchaseDao;
import com.project.mall.ware.service.WmsPurchaseService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 采购信息(WmsPurchase)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:48
 */
@Service("wmsPurchaseService")
public class WmsPurchaseServiceImpl implements WmsPurchaseService {
    @Resource
    private WmsPurchaseDao wmsPurchaseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsPurchase queryById(Long id) {
        return this.wmsPurchaseDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wmsPurchase 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<WmsPurchase> queryByPage(WmsPurchase wmsPurchase, PageRequest pageRequest) {
        long total = this.wmsPurchaseDao.count(wmsPurchase);
        return new PageImpl<>(this.wmsPurchaseDao.queryAllByLimit(wmsPurchase, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param wmsPurchase 实例对象
     * @return 实例对象
     */
    @Override
    public WmsPurchase insert(WmsPurchase wmsPurchase) {
        this.wmsPurchaseDao.insert(wmsPurchase);
        return wmsPurchase;
    }

    /**
     * 修改数据
     *
     * @param wmsPurchase 实例对象
     * @return 实例对象
     */
    @Override
    public WmsPurchase update(WmsPurchase wmsPurchase) {
        this.wmsPurchaseDao.update(wmsPurchase);
        return this.queryById(wmsPurchase.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsPurchaseDao.deleteById(id) > 0;
    }
}
