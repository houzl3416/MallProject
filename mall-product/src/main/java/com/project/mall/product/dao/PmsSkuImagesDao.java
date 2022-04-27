package com.project.mall.product.dao;

import com.project.mall.product.entity.PmsSkuImages;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * sku图片(PmsSkuImages)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSkuImagesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSkuImages queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param pmsSkuImages 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<PmsSkuImages> queryAllByLimit(PmsSkuImages pmsSkuImages, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param pmsSkuImages 查询条件
     * @return 总行数
     */
    long count(PmsSkuImages pmsSkuImages);

    /**
     * 新增数据
     *
     * @param pmsSkuImages 实例对象
     * @return 影响行数
     */
    int insert(PmsSkuImages pmsSkuImages);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsSkuImages> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PmsSkuImages> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsSkuImages> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PmsSkuImages> entities);

    /**
     * 修改数据
     *
     * @param pmsSkuImages 实例对象
     * @return 影响行数
     */
    int update(PmsSkuImages pmsSkuImages);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

