package com.map.mapper;


import com.map.dao.MapLocalInfos;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface MapLocalInfosMapper {
    int insert(MapLocalInfos record);

    int insertSelective(MapLocalInfos record);

    public List< Map<String, Object>> queryAll();
}