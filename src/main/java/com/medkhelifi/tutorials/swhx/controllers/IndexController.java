package com.medkhelifi.tutorials.swhx.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = "application/json")
public class IndexController {

    @RequestMapping(value = "")
    public String index(){
        return "Hello World from deploy/heroku new merge";
    }
}
