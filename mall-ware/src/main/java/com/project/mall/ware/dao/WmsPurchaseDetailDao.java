package com.project.mall.ware.dao;

import com.project.mall.ware.entity.WmsPurchaseDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (WmsPurchaseDetail)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
public interface WmsPurchaseDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsPurchaseDetail queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param wmsPurchaseDetail 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<WmsPurchaseDetail> queryAllByLimit(WmsPurchaseDetail wmsPurchaseDetail, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param wmsPurchaseDetail 查询条件
     * @return 总行数
     */
    long count(WmsPurchaseDetail wmsPurchaseDetail);

    /**
     * 新增数据
     *
     * @param wmsPurchaseDetail 实例对象
     * @return 影响行数
     */
    int insert(WmsPurchaseDetail wmsPurchaseDetail);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WmsPurchaseDetail> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WmsPurchaseDetail> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WmsPurchaseDetail> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WmsPurchaseDetail> entities);

    /**
     * 修改数据
     *
     * @param wmsPurchaseDetail 实例对象
     * @return 影响行数
     */
    int update(WmsPurchaseDetail wmsPurchaseDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

