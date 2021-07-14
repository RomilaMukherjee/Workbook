package com.singtel.assignment_oneb;

import com.singtel.assignment_onea.Bird;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chicken extends Bird {

    private BirdSoundAction birdSoundAction;

    public String makeSound(){
        return birdSoundAction.makeSound();
    }

}

