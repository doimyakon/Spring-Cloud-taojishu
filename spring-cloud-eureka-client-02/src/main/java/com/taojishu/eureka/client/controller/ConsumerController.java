package com.taojishu.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author taojishu
 * @version 1.0.0
 * @ClassName ConsumerController.java
 * @Description TODO
 * @createTime 2021年02月02日 23:50:00
 */
@RestController
@RequestMapping(value = "/hello", produces = "application/json")
public class ConsumerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过调用eureka注册中心服务使用restTemplate实现基础调用功能
     * @return
     */
    @GetMapping("/1")
    public String get(){
        //1、查询服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("eureka-client-01");
        //2、随机取出一个（负载）
        ServiceInstance serviceInstance = instances.get(0);
        //3、元数据信息
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        //4、生成链接
        String url = "http://" + host + ":" + port + "/hello/1";
        //5、发送http请求
        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
        return forEntity.getBody();
    }

}
