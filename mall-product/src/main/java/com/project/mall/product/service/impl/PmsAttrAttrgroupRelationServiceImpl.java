package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsAttrAttrgroupRelation;
import com.project.mall.product.dao.PmsAttrAttrgroupRelationDao;
import com.project.mall.product.service.PmsAttrAttrgroupRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsAttrAttrgroupRelationService")
public class PmsAttrAttrgroupRelationServiceImpl implements PmsAttrAttrgroupRelationService {
    @Resource
    private PmsAttrAttrgroupRelationDao pmsAttrAttrgroupRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation queryById(Long id) {
        return this.pmsAttrAttrgroupRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsAttrAttrgroupRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsAttrAttrgroupRelation> queryByPage(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation, PageRequest pageRequest) {
        long total = this.pmsAttrAttrgroupRelationDao.count(pmsAttrAttrgroupRelation);
        return new PageImpl<>(this.pmsAttrAttrgroupRelationDao.queryAllByLimit(pmsAttrAttrgroupRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation insert(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        this.pmsAttrAttrgroupRelationDao.insert(pmsAttrAttrgroupRelation);
        return pmsAttrAttrgroupRelation;
    }

    /**
     * 修改数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation update(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        this.pmsAttrAttrgroupRelationDao.update(pmsAttrAttrgroupRelation);
        return this.queryById(pmsAttrAttrgroupRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsAttrAttrgroupRelationDao.deleteById(id) > 0;
    }
}
