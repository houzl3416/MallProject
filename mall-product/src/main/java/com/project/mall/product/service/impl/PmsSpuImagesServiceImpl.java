package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsSpuImages;
import com.project.mall.product.dao.PmsSpuImagesDao;
import com.project.mall.product.service.PmsSpuImagesService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * spu图片(PmsSpuImages)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsSpuImagesService")
public class PmsSpuImagesServiceImpl implements PmsSpuImagesService {
    @Resource
    private PmsSpuImagesDao pmsSpuImagesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuImages queryById(Long id) {
        return this.pmsSpuImagesDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsSpuImages 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsSpuImages> queryByPage(PmsSpuImages pmsSpuImages, PageRequest pageRequest) {
        long total = this.pmsSpuImagesDao.count(pmsSpuImages);
        return new PageImpl<>(this.pmsSpuImagesDao.queryAllByLimit(pmsSpuImages, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuImages insert(PmsSpuImages pmsSpuImages) {
        this.pmsSpuImagesDao.insert(pmsSpuImages);
        return pmsSpuImages;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuImages update(PmsSpuImages pmsSpuImages) {
        this.pmsSpuImagesDao.update(pmsSpuImages);
        return this.queryById(pmsSpuImages.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSpuImagesDao.deleteById(id) > 0;
    }
}
