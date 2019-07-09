package com.medkhelifi.tutorials.swhx.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(value = "")
    public ResponseEntity index(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
