package com.springboot.training.mytrainingapp.Common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketballCoach implements Coach {
    BasketballCoach(){
        System.out.println("Constructor :" + BasketballCoach.class.getSimpleName());
    }
    @Override
    public String getMany() {
        return  "20k";
    }
}
