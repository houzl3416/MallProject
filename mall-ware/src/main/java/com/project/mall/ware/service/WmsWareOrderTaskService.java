package com.project.mall.ware.service;

import com.project.mall.ware.entity.WmsWareOrderTask;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 库存工作单(WmsWareOrderTask)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
public interface WmsWareOrderTaskService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareOrderTask queryById(Long id);

    /**
     * 分页查询
     *
     * @param wmsWareOrderTask 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<WmsWareOrderTask> queryByPage(WmsWareOrderTask wmsWareOrderTask, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    WmsWareOrderTask insert(WmsWareOrderTask wmsWareOrderTask);

    /**
     * 修改数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    WmsWareOrderTask update(WmsWareOrderTask wmsWareOrderTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
