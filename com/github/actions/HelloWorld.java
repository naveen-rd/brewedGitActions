package com.github.actions;

/**
 * Hello world.
 *
 **/
public class HelloWorld { 
    
    HelloWorld() {
        System.out.println("Default constructor");
    }
    
    /**
     * main method.
     **/
    public static void main(final String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.myMethod();
        System.out.println("Hello World!! Foo");
    }

    /**
     * Test method.
     **/
    public void myMethod() {
        System.out.println("Void method of the class");
    }
}
