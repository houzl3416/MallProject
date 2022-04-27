package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsCategory;
import com.project.mall.product.dao.PmsCategoryDao;
import com.project.mall.product.service.PmsCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品三级分类(PmsCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsCategoryService")
public class PmsCategoryServiceImpl implements PmsCategoryService {
    @Resource
    private PmsCategoryDao pmsCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param catId 主键
     * @return 实例对象
     */
    @Override
    public PmsCategory queryById(Long catId) {
        return this.pmsCategoryDao.queryById(catId);
    }

    /**
     * 分页查询
     *
     * @param pmsCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsCategory> queryByPage(PmsCategory pmsCategory, PageRequest pageRequest) {
        long total = this.pmsCategoryDao.count(pmsCategory);
        return new PageImpl<>(this.pmsCategoryDao.queryAllByLimit(pmsCategory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCategory insert(PmsCategory pmsCategory) {
        this.pmsCategoryDao.insert(pmsCategory);
        return pmsCategory;
    }

    /**
     * 修改数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCategory update(PmsCategory pmsCategory) {
        this.pmsCategoryDao.update(pmsCategory);
        return this.queryById(pmsCategory.getCatId());
    }

    /**
     * 通过主键删除数据
     *
     * @param catId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long catId) {
        return this.pmsCategoryDao.deleteById(catId) > 0;
    }
}
