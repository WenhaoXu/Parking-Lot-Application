package com.oocl.ParkingLotApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan Wei
 * @date 2018-07-30 17:08
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHelloWorld(){
        return "Hello World!";
    }

}
