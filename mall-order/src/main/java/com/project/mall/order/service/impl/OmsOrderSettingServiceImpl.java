package com.project.mall.order.service.impl;

import com.project.mall.order.entity.OmsOrderSetting;
import com.project.mall.order.dao.OmsOrderSettingDao;
import com.project.mall.order.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 订单配置信息(OmsOrderSetting)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Resource
    private OmsOrderSettingDao omsOrderSettingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting queryById(Long id) {
        return this.omsOrderSettingDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param omsOrderSetting 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OmsOrderSetting> queryByPage(OmsOrderSetting omsOrderSetting, PageRequest pageRequest) {
        long total = this.omsOrderSettingDao.count(omsOrderSetting);
        return new PageImpl<>(this.omsOrderSettingDao.queryAllByLimit(omsOrderSetting, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting insert(OmsOrderSetting omsOrderSetting) {
        this.omsOrderSettingDao.insert(omsOrderSetting);
        return omsOrderSetting;
    }

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting update(OmsOrderSetting omsOrderSetting) {
        this.omsOrderSettingDao.update(omsOrderSetting);
        return this.queryById(omsOrderSetting.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderSettingDao.deleteById(id) > 0;
    }
}
