package com.jtj.cloud.feignclientexample1.controller;

import com.jtj.cloud.feignclientexample1.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2017/8/2.
 */
@Controller
public class IndexController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/show")
    public String show(){
        return "Ok! O Mundo e' belo! This message from feign 2";
    }

    @ResponseBody
    @GetMapping("/feign1")
    public String feign1(){
        return feignService.show();
    }

}
