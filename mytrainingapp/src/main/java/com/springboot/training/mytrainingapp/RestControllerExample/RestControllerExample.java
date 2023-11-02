package com.springboot.training.mytrainingapp.RestControllerExample;

import com.springboot.training.mytrainingapp.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
    Coach myCoach;
    @Autowired
    RestControllerExample(@Qualifier("basketballCoach") Coach theCoach){
        this.myCoach= theCoach;
    }

    @GetMapping
    public String getSayHello(){
        return "Hellooo";

    }

    @GetMapping("/place")
    public String getPlace(){
        return "Ankara";
    }
}
