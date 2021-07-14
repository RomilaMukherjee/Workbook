package com.singtel.assignment_onee;


import com.singtel.assignment_onee.animal.resource.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalCount {
    Animal[] animals;
    int flyingAnimal = 0;
    int walkingAnimal = 0;
    int speakingAnimal = 0;
    int swimmingAnimal = 0;

    public AnimalCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Flyable) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof Walkable) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof Speakable) {
                speakingAnimal += 1;
            }
            if (animals[i] instanceof Swimmable) {
                swimmingAnimal += 1;
            }
        }
    }

}
