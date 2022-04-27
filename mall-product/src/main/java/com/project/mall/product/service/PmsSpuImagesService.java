package com.project.mall.product.service;

import com.project.mall.product.entity.PmsSpuImages;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * spu图片(PmsSpuImages)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSpuImagesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuImages queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsSpuImages 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsSpuImages> queryByPage(PmsSpuImages pmsSpuImages, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    PmsSpuImages insert(PmsSpuImages pmsSpuImages);

    /**
     * 修改数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    PmsSpuImages update(PmsSpuImages pmsSpuImages);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
