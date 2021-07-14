package com.singtel.assignment_oneb;

import com.singtel.assignment_onea.Bird;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Chicken extends Bird {

    private BirdSoundAction birdSoundAction;

    public String makeSound(){
        return birdSoundAction.makeSound();
    }

}

