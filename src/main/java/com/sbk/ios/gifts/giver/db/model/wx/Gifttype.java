/*
 * Gifttype.java
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
public class Gifttype {

    private Long id;
    private String typename;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTypename() {
        return typename;
    }
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}