package com.workingspringboot.projectDecember.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    //@ResponseBody if you are using @Controller
    //RestController is used for gateway for REST calls
    //RestController will inturn use @Service classes for business logics
    public String toGreet(){
        return "Welcome to awesome project";
    }


    @GetMapping("/about")
    public String tellAbout(){
        return "End to end Spring boot project for understanding and deep dive!!";
    }


}
