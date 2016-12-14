/*
 * Giftpage.java
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
public class Giftpage {

    private Long id;
    private String giftname;
    private Long gifttotal;
    private String giftdetails;
    private Long gifttypeId;
    private Long gameId;
    private Long giftnum;
    private Long codetypeId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGiftname() {
        return giftname;
    }
    public void setGiftname(String giftname) {
        this.giftname = giftname == null ? null : giftname.trim();
    }
    public Long getGifttotal() {
        return gifttotal;
    }
    public void setGifttotal(Long gifttotal) {
        this.gifttotal = gifttotal;
    }
    public String getGiftdetails() {
        return giftdetails;
    }
    public void setGiftdetails(String giftdetails) {
        this.giftdetails = giftdetails == null ? null : giftdetails.trim();
    }
    public Long getGifttypeId() {
        return gifttypeId;
    }
    public void setGifttypeId(Long gifttypeId) {
        this.gifttypeId = gifttypeId;
    }
    public Long getGameId() {
        return gameId;
    }
    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
    public Long getGiftnum() {
        return giftnum;
    }
    public void setGiftnum(Long giftnum) {
        this.giftnum = giftnum;
    }
    public Long getCodetypeId() {
        return codetypeId;
    }
    public void setCodetypeId(Long codetypeId) {
        this.codetypeId = codetypeId;
    }
}