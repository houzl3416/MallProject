package com.project.mall.ware.dao;

import com.project.mall.ware.entity.WmsPurchase;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 采购信息(WmsPurchase)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:03:48
 */
public interface WmsPurchaseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsPurchase queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param wmsPurchase 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<WmsPurchase> queryAllByLimit(WmsPurchase wmsPurchase, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param wmsPurchase 查询条件
     * @return 总行数
     */
    long count(WmsPurchase wmsPurchase);

    /**
     * 新增数据
     *
     * @param wmsPurchase 实例对象
     * @return 影响行数
     */
    int insert(WmsPurchase wmsPurchase);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WmsPurchase> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WmsPurchase> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WmsPurchase> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WmsPurchase> entities);

    /**
     * 修改数据
     *
     * @param wmsPurchase 实例对象
     * @return 影响行数
     */
    int update(WmsPurchase wmsPurchase);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

