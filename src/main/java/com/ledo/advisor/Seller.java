package com.ledo.advisor;

public class Seller {
    @AspectTest
    public void greetTo(String name) {
        System.out.println("seller greet to "+name+"......");
    }
}
