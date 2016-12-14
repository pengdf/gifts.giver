package com.sbk.ios.gifts.giver.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 说明
 * 版权
 * Created by fangci on 2016/12/14.
 */
@Controller
@RequestMapping("/test")
public class TestController
{

    @RequestMapping("/t1")
    public ModelAndView t1() {
        ModelAndView m = new ModelAndView("/test/t1");
        m.addObject("key1", "key1");
        return m;
    }

    @RequestMapping("/t2")
    public String t2() {
        return "/test/t2";
    }

}
