package com.kristy;

import com.birdbrain.Finch;

public class Star {
    
    public static void main(String[] args) {
        Finch bird = new Finch();

        for (int i = 0; i < 5; i++) {
            bird.setMove("F", 20, 70);
            bird.setTurn("R", 146.5, 50);
        }

        bird.stopAll();
        bird.disconnect();
    }

}
