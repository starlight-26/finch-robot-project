package com.kristy;

import com.birdbrain.Finch;

public class Star {
    
    public static void main(String[] args) {
        // creates a new Finch object
        Finch bird = new Finch();

        star(5, 20);

        // stops then disconnects the Finch object
        bird.stopAll();
        bird.disconnect();
    }

    public void star (int points, double size) {
        double degrees = 0.0;
        
        // executes the program a certain amount of time
        for (int i = 0; i < points; i++) {
            // has the Finch move forward 
            bird.setMove("F", size, 70);
            // has the Finch turn right
            bird.setTurn("R", degrees, 50);
        }
    }

}
