package com.project.mall.order.dao;

import com.project.mall.order.entity.OmsOrderSetting;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 订单配置信息(OmsOrderSetting)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
public interface OmsOrderSettingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderSetting queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param omsOrderSetting 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<OmsOrderSetting> queryAllByLimit(OmsOrderSetting omsOrderSetting, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param omsOrderSetting 查询条件
     * @return 总行数
     */
    long count(OmsOrderSetting omsOrderSetting);

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实例对象
     * @return 影响行数
     */
    int insert(OmsOrderSetting omsOrderSetting);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsOrderSetting> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OmsOrderSetting> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OmsOrderSetting> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OmsOrderSetting> entities);

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实例对象
     * @return 影响行数
     */
    int update(OmsOrderSetting omsOrderSetting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

