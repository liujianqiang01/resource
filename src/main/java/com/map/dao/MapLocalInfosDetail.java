package com.map.dao;

/**
 * @Author: liujianqiang
 * @Date: 2018/5/20
 * @Description:
 */
public class MapLocalInfosDetail {
    private Long markerId;

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
    }

    private String detailContent;

    public Long getMarkerId() {
        return markerId;
    }

    public void setMarkerId(Long markerId) {
        this.markerId = markerId;
    }


}