package com.map.mapper;


import com.map.dao.MapLocalInfos;
import com.map.dao.MapLocalInfosDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface MapLocalInfosMapper {
    int insert(MapLocalInfos record);

    int insertSelective(MapLocalInfos record);

    public List< Map<String, Object>> queryAll();

    public List< Map<String, Object>> queryAllMarkerId(Long markerId);

    public  Map<String, Object> queryMarkerById(Long markerId);

    public List< Map<String, Object>>  queryMarkersDetail(Long markerId);

    int insertSeDetaillective(MapLocalInfosDetail mapLocalInfosDetail);


}