package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsCategoryBrandRelation;
import com.project.mall.product.dao.PmsCategoryBrandRelationDao;
import com.project.mall.product.service.PmsCategoryBrandRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsCategoryBrandRelationService")
public class PmsCategoryBrandRelationServiceImpl implements PmsCategoryBrandRelationService {
    @Resource
    private PmsCategoryBrandRelationDao pmsCategoryBrandRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsCategoryBrandRelation queryById(Long id) {
        return this.pmsCategoryBrandRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsCategoryBrandRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsCategoryBrandRelation> queryByPage(PmsCategoryBrandRelation pmsCategoryBrandRelation, PageRequest pageRequest) {
        long total = this.pmsCategoryBrandRelationDao.count(pmsCategoryBrandRelation);
        return new PageImpl<>(this.pmsCategoryBrandRelationDao.queryAllByLimit(pmsCategoryBrandRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsCategoryBrandRelation 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCategoryBrandRelation insert(PmsCategoryBrandRelation pmsCategoryBrandRelation) {
        this.pmsCategoryBrandRelationDao.insert(pmsCategoryBrandRelation);
        return pmsCategoryBrandRelation;
    }

    /**
     * 修改数据
     *
     * @param pmsCategoryBrandRelation 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCategoryBrandRelation update(PmsCategoryBrandRelation pmsCategoryBrandRelation) {
        this.pmsCategoryBrandRelationDao.update(pmsCategoryBrandRelation);
        return this.queryById(pmsCategoryBrandRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsCategoryBrandRelationDao.deleteById(id) > 0;
    }
}
