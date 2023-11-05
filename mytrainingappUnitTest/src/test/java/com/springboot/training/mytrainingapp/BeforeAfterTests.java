package com.springboot.training.mytrainingapp;

import org.junit.jupiter.api.*;

public class BeforeAfterTests {

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }


    @Test
    void test2(){
        System.out.println("test2");
    }

    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }

}
