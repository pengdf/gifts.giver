package com.sbk.ios.gifts.giver.web.rs;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 说明
 * 版权
 * Created by fangci on 2016/12/14.
 */
@RestController
@RequestMapping("/testRest")
public class TestRestController {

    @RequestMapping("/test")
    public Map test() {
        JSONObject ret = new JSONObject();
        ret.put("code", 0);
        ret.put("msg", "OK");
        return ret;
    }

}
