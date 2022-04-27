package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsSkuInfo;
import com.project.mall.product.dao.PmsSkuInfoDao;
import com.project.mall.product.service.PmsSkuInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * sku信息(PmsSkuInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsSkuInfoService")
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService {
    @Resource
    private PmsSkuInfoDao pmsSkuInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo queryById(Long skuId) {
        return this.pmsSkuInfoDao.queryById(skuId);
    }

    /**
     * 分页查询
     *
     * @param pmsSkuInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsSkuInfo> queryByPage(PmsSkuInfo pmsSkuInfo, PageRequest pageRequest) {
        long total = this.pmsSkuInfoDao.count(pmsSkuInfo);
        return new PageImpl<>(this.pmsSkuInfoDao.queryAllByLimit(pmsSkuInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo insert(PmsSkuInfo pmsSkuInfo) {
        this.pmsSkuInfoDao.insert(pmsSkuInfo);
        return pmsSkuInfo;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo update(PmsSkuInfo pmsSkuInfo) {
        this.pmsSkuInfoDao.update(pmsSkuInfo);
        return this.queryById(pmsSkuInfo.getSkuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long skuId) {
        return this.pmsSkuInfoDao.deleteById(skuId) > 0;
    }
}
