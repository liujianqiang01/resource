package com.map.service.Impl;

import com.map.dao.MapLocalInfos;
import com.map.dao.MapLocalInfosDetail;
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
        return  map;
    }

    @Override
    public List< Map<String, Object>>  queryAllMarkerId(Long markerId) {
        List <Map<String, Object>>  map = mapLocalInfosMapper.queryAllMarkerId(markerId);
        return  map;
    }
    @Override
    public void insertSelective(String placeid,String placeName,String placeImageUrl,String placeAddress
        ,String placeLongitude,String placeLatitude,String placeContent,String placeIconPath,String title)throws  Exception {
        MapLocalInfos mapLoaclInfo = new MapLocalInfos();
        mapLoaclInfo.setPlaceId(placeid);
        mapLoaclInfo.setPlaceName(placeName);
        mapLoaclInfo.setPlaceIconpath(placeIconPath);
        mapLoaclInfo.setPlaceLatitude(placeLatitude);
        mapLoaclInfo.setPlaceLongitude(placeLongitude);
        mapLoaclInfo.setPlaceContent(placeContent);
        mapLoaclInfo.setPlaceTitle(title);
        mapLocalInfosMapper.insertSelective(mapLoaclInfo);
    }

    @Override
    public Map<String, Object> queryDetailMarkerId(Long markerId) {
       Map<String, Object>  map = mapLocalInfosMapper.queryMarkerById(markerId);
       List< Map<String, Object>> details = mapLocalInfosMapper.queryMarkersDetail(markerId);
       map.put("details",details);

        return  map;
    }

    @Override
    public void insertSeDetaillective(MapLocalInfosDetail mapLocalInfosDetail) throws Exception {
        mapLocalInfosMapper.insertSeDetaillective(mapLocalInfosDetail);
    }
}
