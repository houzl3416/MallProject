package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsAttrGroup;
import com.project.mall.product.dao.PmsAttrGroupDao;
import com.project.mall.product.service.PmsAttrGroupService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 属性分组(PmsAttrGroup)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsAttrGroupService")
public class PmsAttrGroupServiceImpl implements PmsAttrGroupService {
    @Resource
    private PmsAttrGroupDao pmsAttrGroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param attrGroupId 主键
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup queryById(Long attrGroupId) {
        return this.pmsAttrGroupDao.queryById(attrGroupId);
    }

    /**
     * 分页查询
     *
     * @param pmsAttrGroup 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsAttrGroup> queryByPage(PmsAttrGroup pmsAttrGroup, PageRequest pageRequest) {
        long total = this.pmsAttrGroupDao.count(pmsAttrGroup);
        return new PageImpl<>(this.pmsAttrGroupDao.queryAllByLimit(pmsAttrGroup, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup insert(PmsAttrGroup pmsAttrGroup) {
        this.pmsAttrGroupDao.insert(pmsAttrGroup);
        return pmsAttrGroup;
    }

    /**
     * 修改数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup update(PmsAttrGroup pmsAttrGroup) {
        this.pmsAttrGroupDao.update(pmsAttrGroup);
        return this.queryById(pmsAttrGroup.getAttrGroupId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attrGroupId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long attrGroupId) {
        return this.pmsAttrGroupDao.deleteById(attrGroupId) > 0;
    }
}
