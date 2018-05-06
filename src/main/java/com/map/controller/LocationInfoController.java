package com.map.controller;

import com.map.dao.MapLocalInfos;
import com.map.service.MapLocalInfosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LocationInfoController {

    @Autowired
    private MapLocalInfosService mapLocalInfosService;

    private static Logger log = LoggerFactory.getLogger(LocationInfoController.class);

    /*
    获取用户信息
    */
    @RequestMapping("/index")
    @ResponseBody
    public Object index(){

        return mapLocalInfosService.queryAll();
    }
    /*
    * 发布消息
    * */
    @RequestMapping(value = "/publishMsg")
    @ResponseBody
    public Object publishMsg(HttpServletRequest requset){
        try {
            String placeid = requset.getParameter("placeid");
            String placeContent = requset.getParameter("content");
            String placeLongitude = requset.getParameter("longitude");
            String placeLatitude = requset.getParameter("latitude");
            String placeName = requset.getParameter("nickName");
            String placeImageUrl = requset.getParameter("avatarUrl");
            String placeAddress = requset.getParameter("address");
            String placeIconPath = requset.getParameter("avatarUrl");
            String placeTitle = requset.getParameter("tatil");
            mapLocalInfosService.insertSelective( placeid, placeName, placeImageUrl, placeAddress
                    , placeLongitude, placeLatitude, placeContent, placeIconPath,placeTitle);
            return "0";
        } catch (Exception e) {
            log.error("发布消息失败",e);
            return "500";
        }

    }




}
