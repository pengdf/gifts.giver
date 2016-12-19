package com.sbk.ios.gifts.giver.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/19.
 */
@Controller
public class IndexController {
    @RequestMapping("a")
    public String jsonDo3(){

        return "index";
    }
}
