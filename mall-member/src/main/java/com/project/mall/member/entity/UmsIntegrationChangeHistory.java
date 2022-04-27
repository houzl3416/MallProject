package com.project.mall.member.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)实体类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public class UmsIntegrationChangeHistory implements Serializable {
    private static final long serialVersionUID = 799259434862799896L;
    /**
     * id
     */
    private Long id;
    /**
     * member_id
     */
    private Long memberId;
    /**
     * create_time
     */
    private Date createTime;
    /**
     * 变化的值
     */
    private Integer changeCount;
    /**
     * 备注
     */
    private String note;
    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    private Integer sourceTyoe;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSourceTyoe() {
        return sourceTyoe;
    }

    public void setSourceTyoe(Integer sourceTyoe) {
        this.sourceTyoe = sourceTyoe;
    }

}

