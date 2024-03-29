package com.tuyue.pojo;

import javax.persistence.*;

/**
 * @Author: 王金海
 * @Description:
 * @Date: Created by Administrator on 2017/9/27.
 * @Modified By:
 */
@Entity
@Table(name = "arsfc_geo_country", schema = "carport", catalog = "")
public class ArsfcGeoCountry {
    private int id;
    private String adcode;
    private String name;
    private Double lat;
    private Double lng;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "adcode")
    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "lat")
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "lng")
    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArsfcGeoCountry that = (ArsfcGeoCountry) o;

        if (id != that.id) return false;
        if (adcode != null ? !adcode.equals(that.adcode) : that.adcode != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lng != null ? !lng.equals(that.lng) : that.lng != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (adcode != null ? adcode.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lng != null ? lng.hashCode() : 0);
        return result;
    }
}
