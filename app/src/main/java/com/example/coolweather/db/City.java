package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hydn on 2018/11/9.
 */

public class City extends DataSupport {
    private int id;            //
    private String cityName;  //城市名字
    private int cityCode;    //城市代号
    private int provinceId;  //城市所属省的id值

    public int getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }



    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
