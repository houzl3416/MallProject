package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsSpuInfoDesc;
import com.project.mall.product.dao.PmsSpuInfoDescDao;
import com.project.mall.product.service.PmsSpuInfoDescService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * spu信息介绍(PmsSpuInfoDesc)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsSpuInfoDescService")
public class PmsSpuInfoDescServiceImpl implements PmsSpuInfoDescService {
    @Resource
    private PmsSpuInfoDescDao pmsSpuInfoDescDao;

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuInfoDesc queryById(Long spuId) {
        return this.pmsSpuInfoDescDao.queryById(spuId);
    }

    /**
     * 分页查询
     *
     * @param pmsSpuInfoDesc 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsSpuInfoDesc> queryByPage(PmsSpuInfoDesc pmsSpuInfoDesc, PageRequest pageRequest) {
        long total = this.pmsSpuInfoDescDao.count(pmsSpuInfoDesc);
        return new PageImpl<>(this.pmsSpuInfoDescDao.queryAllByLimit(pmsSpuInfoDesc, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuInfoDesc insert(PmsSpuInfoDesc pmsSpuInfoDesc) {
        this.pmsSpuInfoDescDao.insert(pmsSpuInfoDesc);
        return pmsSpuInfoDesc;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuInfoDesc update(PmsSpuInfoDesc pmsSpuInfoDesc) {
        this.pmsSpuInfoDescDao.update(pmsSpuInfoDesc);
        return this.queryById(pmsSpuInfoDesc.getSpuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long spuId) {
        return this.pmsSpuInfoDescDao.deleteById(spuId) > 0;
    }
}
