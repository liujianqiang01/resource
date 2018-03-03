package com.map.service;

import com.map.dao.MapLocalInfos;

import java.util.List;
import java.util.Map;

public interface MapLocalInfosService {

    /**
     * 查询所有的地理位置信息
     * @return
     */
    public List< Map<String, Object>> queryAll();

    /**
     *新增地理位置信息
     */
    public void insertSelective(String placeid,String placeName,String placeImageUrl,String placeAddress
            ,String placeLongitude,String placeLatitude,String placeContent,String placeIconPath)throws  Exception;
}
