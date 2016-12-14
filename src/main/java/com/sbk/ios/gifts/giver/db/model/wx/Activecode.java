/*
 * Activecode.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.model.wx;

/**
 * 
 * 
 * @author JeffieChan
 * @version 1.0 2016-12-14 17:27
 */
public class Activecode {

    private Long id;
    private String activecode;
    private Long codetypeId;
    private Integer chartstate;
    private String phonenumber;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getActivecode() {
        return activecode;
    }
    public void setActivecode(String activecode) {
        this.activecode = activecode == null ? null : activecode.trim();
    }
    public Long getCodetypeId() {
        return codetypeId;
    }
    public void setCodetypeId(Long codetypeId) {
        this.codetypeId = codetypeId;
    }
    public Integer getChartstate() {
        return chartstate;
    }
    public void setChartstate(Integer chartstate) {
        this.chartstate = chartstate;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }
}