package com.project.mall.ware.service;

import com.project.mall.ware.entity.WmsWareOrderTaskDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
public interface WmsWareOrderTaskDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareOrderTaskDetail queryById(Long id);

    /**
     * 分页查询
     *
     * @param wmsWareOrderTaskDetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<WmsWareOrderTaskDetail> queryByPage(WmsWareOrderTaskDetail wmsWareOrderTaskDetail, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    WmsWareOrderTaskDetail insert(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

    /**
     * 修改数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    WmsWareOrderTaskDetail update(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
