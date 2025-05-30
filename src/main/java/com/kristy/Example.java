package com.kristy;

import com.birdbrain.Finch;

public class Example {
    
    public static void main(String[] args) {
        Finch bird = new Finch();

        bird.setMove("F", 15, 100);
        bird.setTurn("R",90,50);
        
        bird.print("HELLO");
        bird.pause(3.5);

        String alphabet[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i < alphabet.length; i++) {
            bird.print(alphabet[i]);
            bird.pause(1);
        }

        bird.stopAll();
        bird.disconnect();
    }

}
