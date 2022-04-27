package com.project.mall.order.dao;

import com.project.mall.order.entity.OmsOrderItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 订单项信息(OmsOrderItem)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
public interface OmsOrderItemDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderItem queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param omsOrderItem 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<OmsOrderItem> queryAllByLimit(OmsOrderItem omsOrderItem, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param omsOrderItem 查询条件
     * @return 总行数
     */
    long count(OmsOrderItem omsOrderItem);

    /**
     * 新增数据
     *
     * @param omsOrderItem 实例对象
     * @return 影响行数
     */
    int insert(OmsOrderItem omsOrderItem);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsOrderItem> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OmsOrderItem> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsOrderItem> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OmsOrderItem> entities);

    /**
     * 修改数据
     *
     * @param omsOrderItem 实例对象
     * @return 影响行数
     */
    int update(OmsOrderItem omsOrderItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

