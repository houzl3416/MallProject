package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsSkuSaleAttrValue;
import com.project.mall.product.dao.PmsSkuSaleAttrValueDao;
import com.project.mall.product.service.PmsSkuSaleAttrValueService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsSkuSaleAttrValueService")
public class PmsSkuSaleAttrValueServiceImpl implements PmsSkuSaleAttrValueService {
    @Resource
    private PmsSkuSaleAttrValueDao pmsSkuSaleAttrValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue queryById(Long id) {
        return this.pmsSkuSaleAttrValueDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsSkuSaleAttrValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsSkuSaleAttrValue> queryByPage(PmsSkuSaleAttrValue pmsSkuSaleAttrValue, PageRequest pageRequest) {
        long total = this.pmsSkuSaleAttrValueDao.count(pmsSkuSaleAttrValue);
        return new PageImpl<>(this.pmsSkuSaleAttrValueDao.queryAllByLimit(pmsSkuSaleAttrValue, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue insert(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        this.pmsSkuSaleAttrValueDao.insert(pmsSkuSaleAttrValue);
        return pmsSkuSaleAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue update(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        this.pmsSkuSaleAttrValueDao.update(pmsSkuSaleAttrValue);
        return this.queryById(pmsSkuSaleAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuSaleAttrValueDao.deleteById(id) > 0;
    }
}
