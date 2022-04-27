package com.project.mall.ware.service;

import com.project.mall.ware.entity.WmsWareInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 仓库信息(WmsWareInfo)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
public interface WmsWareInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @param wmsWareInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<WmsWareInfo> queryByPage(WmsWareInfo wmsWareInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    WmsWareInfo insert(WmsWareInfo wmsWareInfo);

    /**
     * 修改数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    WmsWareInfo update(WmsWareInfo wmsWareInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
