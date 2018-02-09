package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by joseph on 07/02/2018.
 */
@RestController
public class DemoController {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private  RestTemplate restTemplate;


    @RequestMapping("/demo")
    public String demoLoging(){
        LOGGER.info("Im here  demoLoging");
        String response = restTemplate.getForObject("http://localhost:9966/start",String.class);
        return "DEMO [" +  response  +" ]";
    }

    @RequestMapping("/start")
    public String demoLoging2(){
        LOGGER.info("Im here  demoLoging2");
        return "Hello from service 2 ";
    }
}
