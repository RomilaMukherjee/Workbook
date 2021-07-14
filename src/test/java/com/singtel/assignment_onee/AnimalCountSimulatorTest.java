package com.singtel.assignment_onee;

import com.singtel.assignment_onee.animal.resource.*;
import org.junit.Assert;
import org.junit.Test;

public class AnimalCountSimulatorTest {

    Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot(),
            new Fish(),
            new Shark(),
            new Clownfish(),
            new Frog(),
            new Dog(),
            new Butterfly(),
            new Cat()
    };


    @Test
    public void testAnimalCountWhichCanFly() {
        AnimalCountSimulator animalCountSimulator = new AnimalCountSimulator();
        int count = animalCountSimulator.getFlyingAnimalCount(animals);
        Assert.assertEquals(6, count);
        //Bird, Duck, Chicken , Rooster, Parrot, Butterfly
    }

}