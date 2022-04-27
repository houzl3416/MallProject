package com.project.mall.coupon.dao;

import com.project.mall.coupon.entity.SmsCouponHistory;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsCouponHistoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsCouponHistory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param smsCouponHistory 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<SmsCouponHistory> queryAllByLimit(SmsCouponHistory smsCouponHistory, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param smsCouponHistory 查询条件
     * @return 总行数
     */
    long count(SmsCouponHistory smsCouponHistory);

    /**
     * 新增数据
     *
     * @param smsCouponHistory 实例对象
     * @return 影响行数
     */
    int insert(SmsCouponHistory smsCouponHistory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SmsCouponHistory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SmsCouponHistory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SmsCouponHistory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SmsCouponHistory> entities);

    /**
     * 修改数据
     *
     * @param smsCouponHistory 实例对象
     * @return 影响行数
     */
    int update(SmsCouponHistory smsCouponHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

