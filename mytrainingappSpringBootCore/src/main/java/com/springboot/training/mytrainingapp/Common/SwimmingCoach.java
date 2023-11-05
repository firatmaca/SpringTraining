package com.springboot.training.mytrainingapp.Common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{
    SwimmingCoach(){
        System.out.println("Constructor :" + SwimmingCoach.class.getSimpleName());
    }
    @Override
    public String getMany() {
        return  "30k";
    }
}
