package com.singtel.assignment_onee.animal.resource;

public class Frog extends Animal implements Swimmable, Walkable, Speakable {

    public void callSound() {
        System.out.println("I can make sound");
    }

    public void canSwim() {

        System.out.println("I can make swim");
    }

    public void canWalk() {
        System.out.println("I can walk");
    }
}
