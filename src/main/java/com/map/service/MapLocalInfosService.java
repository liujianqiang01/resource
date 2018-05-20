package com.map.service;

import com.map.dao.MapLocalInfos;
import com.map.dao.MapLocalInfosDetail;

import java.util.List;
import java.util.Map;

public interface MapLocalInfosService {

    /**
     * 查询所有的地理位置信息
     * @return
     */
    public List< Map<String, Object>> queryAll();


    /**
     * 查询地理位置信息
     * @return
     */
    public List< Map<String, Object>> queryAllMarkerId(Long markerId);

    /**
     *新增地理位置信息
     */
    public void insertSelective(String placeid,String placeName,String placeImageUrl,String placeAddress
            ,String placeLongitude,String placeLatitude,String placeContent,String placeIconPath,String title)throws  Exception;


    /**
     * 查询详情
     * @return
     */
    public Map<String, Object> queryDetailMarkerId(Long markerId);

    /**
     *新增详情
     */
    public void insertSeDetaillective(MapLocalInfosDetail mapLocalInfosDetail)throws  Exception;

}
