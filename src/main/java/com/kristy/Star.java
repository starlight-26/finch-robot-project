package com.kristy;

import com.birdbrain.Finch;

public class Star {
    
    public static void main(String[] args) {
        // creates a new Star object
        Star s = new Star();

        // calls the star method
        s.star(5);

    }

    /**
     * Draws a star with a specified amount of points
     * 
     * @params points
     */
    public void star (int points) {
        // creates a new Finch object
        Finch bird = new Finch();

        // figures out the degrees for each star point
        double degrees = ((2 * 360) / points) + 2.85;
        
        // executes the program a certain amount of time
        for (int i = 0; i < points; i++) {
            // has the Finch move forward 
            bird.setMove("F", 15, 100);
            // has the Finch turn right
            bird.setTurn("R", degrees, 50);
        }

        // stops then disconnects the Finch object
        bird.stopAll();
        bird.disconnect();
    }

}
