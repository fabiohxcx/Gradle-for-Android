package com.fabiohideki.telljokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {

    public static String getJoke() {

        List<String> jokesList = new ArrayList<>();

        jokesList.add("Q: What goes up and down but does not move? A: Stairs");

        jokesList.add("Q: Where should a 500 pound alien go? A: On a diet");
        jokesList.add("Q: What did one toilet say to the other? A: You look a bit flushed.");
        jokesList.add("Did you hear about the restaurant on the moon? Great food, no atmosphere.");
        jokesList.add("What do you call a fake noodle? An Impasta.");
        jokesList.add("How many apples grow on a tree? All of them.");
        jokesList.add("Want to hear a joke about paper? Nevermind it's tearable.");
        jokesList.add("I just watched a program about beavers. It was the best dam program I've ever seen.");

        Random randomGenerator = new Random();

        return jokesList.get(randomGenerator.nextInt(jokesList.size()));
    }


}
