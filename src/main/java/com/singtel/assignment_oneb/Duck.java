package com.singtel.assignment_oneb;

import com.singtel.assignment_onea.Bird;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Duck extends Bird {

    private BirdSoundAction birdSoundAction;
    private BirdSwimAction birdSwimAction;


    public String makeSound() {
        return birdSoundAction.makeSound();
    }

    public String swimDeep() {
        return birdSwimAction.swim();
    }

}
