package com.project.mall.order.dao;

import com.project.mall.order.entity.OmsRefundInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 退款信息(OmsRefundInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
public interface OmsRefundInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsRefundInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param omsRefundInfo 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<OmsRefundInfo> queryAllByLimit(OmsRefundInfo omsRefundInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param omsRefundInfo 查询条件
     * @return 总行数
     */
    long count(OmsRefundInfo omsRefundInfo);

    /**
     * 新增数据
     *
     * @param omsRefundInfo 实例对象
     * @return 影响行数
     */
    int insert(OmsRefundInfo omsRefundInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsRefundInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OmsRefundInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsRefundInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OmsRefundInfo> entities);

    /**
     * 修改数据
     *
     * @param omsRefundInfo 实例对象
     * @return 影响行数
     */
    int update(OmsRefundInfo omsRefundInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

