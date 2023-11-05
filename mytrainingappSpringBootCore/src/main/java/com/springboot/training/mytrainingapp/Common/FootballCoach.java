package com.springboot.training.mytrainingapp.Common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach  implements  Coach{
    FootballCoach(){
        System.out.println("Constructor :" + FootballCoach.class.getSimpleName());
    }
    @Override
    public String getMany() {
        return  "10k";
    }
}
