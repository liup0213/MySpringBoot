package com.liupeng.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {
    //逐个读取配置值
    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

    @RequestMapping("boot/config")
    public @ResponseBody String config(){
        return name+"----"+location;

    }
}
