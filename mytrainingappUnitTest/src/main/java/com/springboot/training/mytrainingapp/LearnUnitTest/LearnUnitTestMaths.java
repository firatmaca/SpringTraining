package com.springboot.training.mytrainingapp.LearnUnitTest;

public class LearnUnitTestMaths {
    public int calculateSum(int [] arr){
        int sum = 0;
        for(int a : arr){
            sum+=a;
        }
        return  sum;
    }
}
