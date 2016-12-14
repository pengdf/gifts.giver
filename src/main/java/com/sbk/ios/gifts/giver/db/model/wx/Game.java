/*
 * Game.java
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
public class Game {

    private Long id;
    private String gamename;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGamename() {
        return gamename;
    }
    public void setGamename(String gamename) {
        this.gamename = gamename == null ? null : gamename.trim();
    }
}