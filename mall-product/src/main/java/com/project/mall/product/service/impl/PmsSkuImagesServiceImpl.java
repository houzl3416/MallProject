package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsSkuImages;
import com.project.mall.product.dao.PmsSkuImagesDao;
import com.project.mall.product.service.PmsSkuImagesService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * sku图片(PmsSkuImages)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsSkuImagesService")
public class PmsSkuImagesServiceImpl implements PmsSkuImagesService {
    @Resource
    private PmsSkuImagesDao pmsSkuImagesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuImages queryById(Long id) {
        return this.pmsSkuImagesDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsSkuImages 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsSkuImages> queryByPage(PmsSkuImages pmsSkuImages, PageRequest pageRequest) {
        long total = this.pmsSkuImagesDao.count(pmsSkuImages);
        return new PageImpl<>(this.pmsSkuImagesDao.queryAllByLimit(pmsSkuImages, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuImages insert(PmsSkuImages pmsSkuImages) {
        this.pmsSkuImagesDao.insert(pmsSkuImages);
        return pmsSkuImages;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuImages update(PmsSkuImages pmsSkuImages) {
        this.pmsSkuImagesDao.update(pmsSkuImages);
        return this.queryById(pmsSkuImages.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuImagesDao.deleteById(id) > 0;
    }
}
