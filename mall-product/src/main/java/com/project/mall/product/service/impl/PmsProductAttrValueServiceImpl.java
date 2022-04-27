package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsProductAttrValue;
import com.project.mall.product.dao.PmsProductAttrValueDao;
import com.project.mall.product.service.PmsProductAttrValueService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * spu属性值(PmsProductAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsProductAttrValueService")
public class PmsProductAttrValueServiceImpl implements PmsProductAttrValueService {
    @Resource
    private PmsProductAttrValueDao pmsProductAttrValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue queryById(Long id) {
        return this.pmsProductAttrValueDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsProductAttrValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsProductAttrValue> queryByPage(PmsProductAttrValue pmsProductAttrValue, PageRequest pageRequest) {
        long total = this.pmsProductAttrValueDao.count(pmsProductAttrValue);
        return new PageImpl<>(this.pmsProductAttrValueDao.queryAllByLimit(pmsProductAttrValue, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue insert(PmsProductAttrValue pmsProductAttrValue) {
        this.pmsProductAttrValueDao.insert(pmsProductAttrValue);
        return pmsProductAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue update(PmsProductAttrValue pmsProductAttrValue) {
        this.pmsProductAttrValueDao.update(pmsProductAttrValue);
        return this.queryById(pmsProductAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttrValueDao.deleteById(id) > 0;
    }
}
