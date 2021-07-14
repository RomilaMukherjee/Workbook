package com.singtel.assignment_oned;

import org.junit.Assert;
import org.junit.Test;

public class ParrotSoundSimulatorTest {

    @Test
    public void testRoosterSound(){
        Parrot parrot = new Parrot();
        parrot.setSoundType(new DogSound());
        Assert.assertEquals("Woof, woof", parrot.makeDifferentSound());

        parrot.setSoundType(new RoosterSound());
        Assert.assertEquals("Cock-a-doodle-doo", parrot.makeDifferentSound());

        parrot.setSoundType(new CatSound());
        Assert.assertEquals("Me ow", parrot.makeDifferentSound());

    }

}