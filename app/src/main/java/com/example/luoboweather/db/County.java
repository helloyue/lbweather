package com.example.luoboweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/11/15.
 */

public class County extends DataSupport {

    private int id;

    private String countyNme;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyNme() {
        return countyNme;
    }

    public void setCountyNme(String countyNme) {
        this.countyNme = countyNme;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }



}
