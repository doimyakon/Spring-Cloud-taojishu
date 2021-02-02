package com.taojishu.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taojishu
 * @version 1.0.0
 * @ClassName ProviderController.java
 * @Description TODO
 * @createTime 2021年02月02日 23:50:00
 */
@RestController
@RequestMapping(value = "/hello", produces = "application/json")
public class ProviderController {

    @GetMapping("/1")
    public String get(){
        return "success";
    }

}
