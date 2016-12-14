/*
 * Phone.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.model.wx;

import java.util.Date;

/**
 * 
 * 
 * @author JeffieChan
 * @version 1.0 2016-12-14 17:27
 */
public class Phone {

    private Long id;
    private String phonenumber;
    private Integer activestate;
    private String cookienumber;
    private Date sendtime;
    private String verifycode;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }
    public Integer getActivestate() {
        return activestate;
    }
    public void setActivestate(Integer activestate) {
        this.activestate = activestate;
    }
    public String getCookienumber() {
        return cookienumber;
    }
    public void setCookienumber(String cookienumber) {
        this.cookienumber = cookienumber == null ? null : cookienumber.trim();
    }
    public Date getSendtime() {
        return sendtime;
    }
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
    public String getVerifycode() {
        return verifycode;
    }
    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode == null ? null : verifycode.trim();
    }
}