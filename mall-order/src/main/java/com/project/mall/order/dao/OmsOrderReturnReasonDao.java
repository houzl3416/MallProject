package com.project.mall.order.dao;

import com.project.mall.order.entity.OmsOrderReturnReason;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 退货原因(OmsOrderReturnReason)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
public interface OmsOrderReturnReasonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderReturnReason queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param omsOrderReturnReason 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<OmsOrderReturnReason> queryAllByLimit(OmsOrderReturnReason omsOrderReturnReason, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param omsOrderReturnReason 查询条件
     * @return 总行数
     */
    long count(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * 新增数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 影响行数
     */
    int insert(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsOrderReturnReason> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OmsOrderReturnReason> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsOrderReturnReason> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OmsOrderReturnReason> entities);

    /**
     * 修改数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 影响行数
     */
    int update(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

