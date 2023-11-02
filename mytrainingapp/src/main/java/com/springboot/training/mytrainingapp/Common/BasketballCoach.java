package com.springboot.training.mytrainingapp.Common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    BasketballCoach(){
        System.out.println("Constructor :" + BasketballCoach.class.getSimpleName());
    }
    @Override
    public String getMany() {
        return  "20k";
    }
}
