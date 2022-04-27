package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsMemberReceiveAddress;
import com.project.mall.member.dao.UmsMemberReceiveAddressDao;
import com.project.mall.member.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Resource
    private UmsMemberReceiveAddressDao umsMemberReceiveAddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberReceiveAddress queryById(Long id) {
        return this.umsMemberReceiveAddressDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsMemberReceiveAddress 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsMemberReceiveAddress> queryByPage(UmsMemberReceiveAddress umsMemberReceiveAddress, PageRequest pageRequest) {
        long total = this.umsMemberReceiveAddressDao.count(umsMemberReceiveAddress);
        return new PageImpl<>(this.umsMemberReceiveAddressDao.queryAllByLimit(umsMemberReceiveAddress, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsMemberReceiveAddress 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberReceiveAddress insert(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        this.umsMemberReceiveAddressDao.insert(umsMemberReceiveAddress);
        return umsMemberReceiveAddress;
    }

    /**
     * 修改数据
     *
     * @param umsMemberReceiveAddress 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberReceiveAddress update(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        this.umsMemberReceiveAddressDao.update(umsMemberReceiveAddress);
        return this.queryById(umsMemberReceiveAddress.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberReceiveAddressDao.deleteById(id) > 0;
    }
}
