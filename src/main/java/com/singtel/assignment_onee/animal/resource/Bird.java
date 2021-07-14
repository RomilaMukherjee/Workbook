package com.singtel.assignment_onee.animal.resource;

public class Bird extends Animal implements Walkable, Speakable, Flyable {

    public void callSound() {
        System.out.println("I can make sound");
    }

    public void canWalk() {
        System.out.println("I can walk");
    }

    public void canFly() {
        System.out.println("I can fly");
    }
}
