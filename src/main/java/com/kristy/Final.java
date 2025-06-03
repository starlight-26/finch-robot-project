package com.kristy;

import com.birdbrain.Finch;

public class Final {
    
    public static void main(String[] args) {
        // creates a new Finch object
        Finch bird = new Finch();

        // executes the program a certain amount of time
        for (int i = 0; i < 5; i++) {
            // has the Finch move forward 20 cm
            bird.setMove("F", 20, 70);
            // has the Finch turn 146.5 degrees right
            bird.setTurn("R", 146.5, 50);
        }

        // stops then disconnects the Finch object
        bird.stopAll();
        bird.disconnect();
    }

}
