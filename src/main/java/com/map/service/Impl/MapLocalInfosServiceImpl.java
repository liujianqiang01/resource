package com.map.service.Impl;

import com.map.dao.MapLocalInfos;
import com.map.mapper.MapLocalInfosMapper;
import com.map.service.MapLocalInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class MapLocalInfosServiceImpl implements MapLocalInfosService {

    @Autowired
    private MapLocalInfosMapper mapLocalInfosMapper;
    @Override
    public List< Map<String, Object>>  queryAll() {
        List <Map<String, Object>>  map = mapLocalInfosMapper.queryAll();
        System.out.println(map.toString());
        return  map;
    }

    @Override
    public void insertSelective(String placeid,String placeName,String placeImageUrl,String placeAddress
        ,String placeLongitude,String placeLatitude,String placeContent,String placeIconPath)throws  Exception {
        MapLocalInfos mapLoaclInfo = new MapLocalInfos();
        mapLoaclInfo.setPlaceId(placeid);
        mapLoaclInfo.setPlaceName(placeName);
        mapLoaclInfo.setPlaceIconpath(placeIconPath);
        mapLoaclInfo.setPlaceLatitude(placeLatitude);
        mapLoaclInfo.setPlaceLongitude(placeLongitude);
        mapLoaclInfo.setPlaceContent(placeContent);
        mapLocalInfosMapper.insertSelective(mapLoaclInfo);
    }
}
