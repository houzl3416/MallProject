package com.project.mall.product.service;

import com.project.mall.product.entity.PmsSpuInfoDesc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * spu信息介绍(PmsSpuInfoDesc)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSpuInfoDescService {

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    PmsSpuInfoDesc queryById(Long spuId);

    /**
     * 分页查询
     *
     * @param pmsSpuInfoDesc 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsSpuInfoDesc> queryByPage(PmsSpuInfoDesc pmsSpuInfoDesc, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    PmsSpuInfoDesc insert(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 修改数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    PmsSpuInfoDesc update(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 是否成功
     */
    boolean deleteById(Long spuId);

}
