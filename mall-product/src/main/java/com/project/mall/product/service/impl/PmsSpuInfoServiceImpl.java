package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsSpuInfo;
import com.project.mall.product.dao.PmsSpuInfoDao;
import com.project.mall.product.service.PmsSpuInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * spu信息(PmsSpuInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsSpuInfoService")
public class PmsSpuInfoServiceImpl implements PmsSpuInfoService {
    @Resource
    private PmsSpuInfoDao pmsSpuInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuInfo queryById(Long id) {
        return this.pmsSpuInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsSpuInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsSpuInfo> queryByPage(PmsSpuInfo pmsSpuInfo, PageRequest pageRequest) {
        long total = this.pmsSpuInfoDao.count(pmsSpuInfo);
        return new PageImpl<>(this.pmsSpuInfoDao.queryAllByLimit(pmsSpuInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuInfo insert(PmsSpuInfo pmsSpuInfo) {
        this.pmsSpuInfoDao.insert(pmsSpuInfo);
        return pmsSpuInfo;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuInfo update(PmsSpuInfo pmsSpuInfo) {
        this.pmsSpuInfoDao.update(pmsSpuInfo);
        return this.queryById(pmsSpuInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSpuInfoDao.deleteById(id) > 0;
    }
}
