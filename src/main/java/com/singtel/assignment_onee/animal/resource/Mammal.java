package com.singtel.assignment_onee.animal.resource;

public abstract class Mammal extends Animal implements Walkable, Speakable {

    public void callSound() {
        System.out.println("I can make sound");
    }

    public void canWalk() {
        System.out.println("I can walk");
    }
}
