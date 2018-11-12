package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hydn on 2018/11/9.
 */

public class Province extends DataSupport {
    private int id;              //每个实体类应有的
    private String provinceName; //省名字
    private  int provinceCode;   //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }


    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
