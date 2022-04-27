package com.project.mall.product.entity;

import java.io.Serializable;

/**
 * spu图片(PmsSpuImages)实体类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public class PmsSpuImages implements Serializable {
    private static final long serialVersionUID = 773363602335055316L;
    /**
     * id
     */
    private Long id;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * 图片名
     */
    private String imgName;
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * 顺序
     */
    private Integer imgSort;
    /**
     * 是否默认图
     */
    private Integer defaultImg;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getImgSort() {
        return imgSort;
    }

    public void setImgSort(Integer imgSort) {
        this.imgSort = imgSort;
    }

    public Integer getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(Integer defaultImg) {
        this.defaultImg = defaultImg;
    }

}

