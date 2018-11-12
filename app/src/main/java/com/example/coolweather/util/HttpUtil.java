package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by hydn on 2018/11/10.
 */
//全国所有省市县的数据从服务器获得
public class HttpUtil {
    //发起一条HTTP请求    参数 地址 回调处理服务器响应
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
