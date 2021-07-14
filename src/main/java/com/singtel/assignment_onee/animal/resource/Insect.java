package com.singtel.assignment_onee.animal.resource;

public class Insect extends Animal implements Flyable, Walkable, Speakable {

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
