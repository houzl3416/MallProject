package com.project.mall.ware.service;

import com.project.mall.ware.entity.WmsWareSku;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品库存(WmsWareSku)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
public interface WmsWareSkuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareSku queryById(Long id);

    /**
     * 分页查询
     *
     * @param wmsWareSku 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<WmsWareSku> queryByPage(WmsWareSku wmsWareSku, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param wmsWareSku 实例对象
     * @return 实例对象
     */
    WmsWareSku insert(WmsWareSku wmsWareSku);

    /**
     * 修改数据
     *
     * @param wmsWareSku 实例对象
     * @return 实例对象
     */
    WmsWareSku update(WmsWareSku wmsWareSku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
