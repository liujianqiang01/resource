package com.map.resource;

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

    /*
    获取用户信息
    */
    @RequestMapping("/index")
    @ResponseBody
    public Object index(){

        List< Map<String, Object>> list = new ArrayList< Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String,Object>();
        map1.put("id" ,"1");
        map1.put("placeName" ,"中关村广场");
        map1.put("placeImageUrl" ,"");
        map1.put("placeAddress" ,"");
        map1.put("placeLongitude" ,"116.303900");
        map1.put("placeLatitude" ,"39.976460");
        map1.put("placeContent" ,"网吧吃鸡有没有一起的");
        map1.put("placeIconPath","https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKN7XwCLBvPyrSTUNEvPS48FicXvFzHXicOeq4lF6d49LkTsYciaoyfALbmy28KbIu7HzwC4ob9gVjUg/0");
        Map<String, Object> map2 = new HashMap<String,Object>();
        map2.put("id" ,"2");
        map2.put("placeName" ,"东城区广场");
        map2.put("placeImageUrl" ,"");
        map2.put("placeAddress" ,"");
        map2.put("placeLongitude" ,"116.407526");
        map2.put("placeLatitude" ,"39.904030");
        map2.put("placeContent" ,"来呀，快活呀");
        map2.put("placeIconPath","");
        Map<String, Object> map3 = new HashMap<String,Object>();
        map3.put("id" ,"3");
        map3.put("placeName" ,"回龙观广场");
        map3.put("placeImageUrl" ,"");
        map3.put("placeAddress" ,"");
        map3.put("placeLongitude" ,"116.362300");
        map3.put("placeLatitude" ,"40.083480");
        map3.put("placeContent" ,"北京到月球——顺风车");
        map3.put("placeIconPath","");
        Map<String, Object> map4 = new HashMap<String,Object>();
        map4.put("id" ,"4");
        map4.put("placeName" ,"望京");
        map4.put("placeImageUrl" ,"");
        map4.put("placeAddress" ,"");
        map4.put("placeLongitude" ,"116.474983");
        map4.put("placeLatitude" ,"39.992589");
        map4.put("placeContent" ,"买馒头");
        map4.put("placeIconPath","");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        return list;
    }
    /*
    * 发布消息
    * */
    @RequestMapping("/publishMsg")
    public Object publishMsg(HttpServletRequest requset){
        String str = requset.getParameter("content");
        String str1 = requset.getParameter("longitude");
        String str2 = requset.getParameter("latitude");
        String str3 = requset.getParameter("nickName");
        System.out.println(str+str1+str2+str3);
        return "";
    }
}
