package com.bleu.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public static void setup(){
        System.out.println("this is coming from before");
    }




    @After
    public void teardown(){
        System.out.println("this is coming from after");
    }
}
