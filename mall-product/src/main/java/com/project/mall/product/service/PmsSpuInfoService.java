package com.project.mall.product.service;

import com.project.mall.product.entity.PmsSpuInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * spu信息(PmsSpuInfo)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSpuInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsSpuInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsSpuInfo> queryByPage(PmsSpuInfo pmsSpuInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 实例对象
     */
    PmsSpuInfo insert(PmsSpuInfo pmsSpuInfo);

    /**
     * 修改数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 实例对象
     */
    PmsSpuInfo update(PmsSpuInfo pmsSpuInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
