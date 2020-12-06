package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //создаст бин из этого класса
public class MusicPlayer {


    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(){
        System.out.println("Playing " + classicalMusic.getSong());
                System.out.println("Playing " + rockMusic.getSong());
    }
}
