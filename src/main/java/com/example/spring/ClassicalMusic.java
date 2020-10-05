package com.example.spring;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void init(){
        System.out.println("My Initialization");
    }

    public void destroy(){
        System.out.println("My destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
