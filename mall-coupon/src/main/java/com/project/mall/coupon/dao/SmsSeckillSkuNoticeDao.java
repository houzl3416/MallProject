package com.project.mall.coupon.dao;

import com.project.mall.coupon.entity.SmsSeckillSkuNotice;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsSeckillSkuNoticeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSeckillSkuNotice queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param smsSeckillSkuNotice 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<SmsSeckillSkuNotice> queryAllByLimit(SmsSeckillSkuNotice smsSeckillSkuNotice, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param smsSeckillSkuNotice 查询条件
     * @return 总行数
     */
    long count(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * 新增数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 影响行数
     */
    int insert(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SmsSeckillSkuNotice> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SmsSeckillSkuNotice> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SmsSeckillSkuNotice> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SmsSeckillSkuNotice> entities);

    /**
     * 修改数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 影响行数
     */
    int update(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

