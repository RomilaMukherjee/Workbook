package com.singtel.assignment_oneb;


import org.junit.Assert;
import org.junit.Test;

public class BirdSimulatorTest {


    @Test
    public void test(){
        Duck duck = new Duck();
        duck.setBirdSwimAction(new DuckSwimDeep());
        Assert.assertEquals("Ducks can swim deep",duck.swimDeep());

        duck.setBirdSoundAction(new DuckSound());
        Assert.assertEquals("Quack quack",duck.makeSound());

        //Chicken
        Chicken chicken = new Chicken();
        chicken.setBirdSoundAction(new ChickenSound());
        Assert.assertEquals("Cluck cluck",chicken.makeSound());
    }

}