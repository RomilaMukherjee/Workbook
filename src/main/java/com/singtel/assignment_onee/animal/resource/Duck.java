package com.singtel.assignment_onee.animal.resource;

public class Duck extends Bird implements Swimmable, Flyable {

   public void canFly() {

       super.canFly();
   }

    public void canSwim() {
        System.out.println("I can swim");
    }
}
