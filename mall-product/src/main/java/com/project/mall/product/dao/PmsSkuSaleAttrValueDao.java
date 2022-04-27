package com.project.mall.product.dao;

import com.project.mall.product.entity.PmsSkuSaleAttrValue;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSkuSaleAttrValueDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSkuSaleAttrValue queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param pmsSkuSaleAttrValue 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<PmsSkuSaleAttrValue> queryAllByLimit(PmsSkuSaleAttrValue pmsSkuSaleAttrValue, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param pmsSkuSaleAttrValue 查询条件
     * @return 总行数
     */
    long count(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 影响行数
     */
    int insert(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsSkuSaleAttrValue> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PmsSkuSaleAttrValue> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsSkuSaleAttrValue> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PmsSkuSaleAttrValue> entities);

    /**
     * 修改数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 影响行数
     */
    int update(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

