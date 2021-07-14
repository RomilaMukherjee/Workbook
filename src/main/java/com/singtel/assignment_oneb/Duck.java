package com.singtel.assignment_oneb;

import com.singtel.assignment_onea.Bird;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
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
