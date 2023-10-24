package com.springboot.training.mytrainingapp.RestControllerExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

    @GetMapping
    public String getSayHello(){
        return "Hellooo";

    }

    @GetMapping("/place")
    public String getPlace(){
        return "Ankara";
    }
}
