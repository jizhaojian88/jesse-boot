package com.jesse03.case02.ribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jesse03.case02.ribbon.service.HelloService;

/**
 * Created by fangzhipeng on 2017/4/6.
 * http://localhost:8764/hi?name=forezp
 */
@RestController
public class HelloControler {



    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }


}
