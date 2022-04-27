package com.project.mall.ware.service.impl;

import com.project.mall.ware.entity.WmsWareSku;
import com.project.mall.ware.dao.WmsWareSkuDao;
import com.project.mall.ware.service.WmsWareSkuService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品库存(WmsWareSku)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@Service("wmsWareSkuService")
public class WmsWareSkuServiceImpl implements WmsWareSkuService {
    @Resource
    private WmsWareSkuDao wmsWareSkuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareSku queryById(Long id) {
        return this.wmsWareSkuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wmsWareSku 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<WmsWareSku> queryByPage(WmsWareSku wmsWareSku, PageRequest pageRequest) {
        long total = this.wmsWareSkuDao.count(wmsWareSku);
        return new PageImpl<>(this.wmsWareSkuDao.queryAllByLimit(wmsWareSku, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param wmsWareSku 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareSku insert(WmsWareSku wmsWareSku) {
        this.wmsWareSkuDao.insert(wmsWareSku);
        return wmsWareSku;
    }

    /**
     * 修改数据
     *
     * @param wmsWareSku 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareSku update(WmsWareSku wmsWareSku) {
        this.wmsWareSkuDao.update(wmsWareSku);
        return this.queryById(wmsWareSku.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareSkuDao.deleteById(id) > 0;
    }
}
