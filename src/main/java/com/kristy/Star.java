package com.kristy;

import com.birdbrain.Finch;

public class Star {
    
    public static void main(String[] args) {
        Finch bird = new Finch();

        bird.setMove("F", 15, 100);
        bird.setTurn("R", 120, 50);
        bird.setMove("F", 15, 100);

        bird.stopAll();
        bird.disconnect();
    }

}
