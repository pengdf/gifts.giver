package com.sbk.ios.gifts.giver.util;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class JSONResult {
    private boolean success = true;
    private String msg;

    public JSONResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public JSONResult() {
    }

    public JSONResult(String msg) {
        this.msg = msg;
    }
}
