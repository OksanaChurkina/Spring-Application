package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //создаст бин из этого класса
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private Music music;

    //IoC
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic)
    {
        this.classicalMusic = classicalMusic;
    }

    public MusicPlayer(){}


    public void playMusic(){
        System.out.println("Playing " + classicalMusic.getSong());
    }
}
