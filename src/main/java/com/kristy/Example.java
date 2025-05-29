package com.kristy;

import com.birdbrain.Finch;

public class Example {
    
    public static void main(String[] args) {
        Finch bird = new Finch();

        bird.setMove("F", 10,50);
        bird.print("hello");

        bird.stop();
        bird.disconnect();
    }

}
