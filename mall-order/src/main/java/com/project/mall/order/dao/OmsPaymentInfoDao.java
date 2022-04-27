package com.project.mall.order.dao;

import com.project.mall.order.entity.OmsPaymentInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 支付信息表(OmsPaymentInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
public interface OmsPaymentInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsPaymentInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param omsPaymentInfo 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<OmsPaymentInfo> queryAllByLimit(OmsPaymentInfo omsPaymentInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param omsPaymentInfo 查询条件
     * @return 总行数
     */
    long count(OmsPaymentInfo omsPaymentInfo);

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 影响行数
     */
    int insert(OmsPaymentInfo omsPaymentInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsPaymentInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OmsPaymentInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsPaymentInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OmsPaymentInfo> entities);

    /**
     * 修改数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 影响行数
     */
    int update(OmsPaymentInfo omsPaymentInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

