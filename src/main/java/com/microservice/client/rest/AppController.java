package com.microservice.client.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/getList")
    public String test(){
        return "hii"; //TODO move to server MC
    }
}
