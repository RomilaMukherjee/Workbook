package com.singtel.assignment_onee;

import com.singtel.assignment_onee.animal.resource.Animal;

public class AnimalCountSimulator {

        public int getFlyingAnimalCount(Animal[] animals) {
            AnimalCount animalCount = new AnimalCount(animals);
            int flyingAnimal = animalCount.getFlyingAnimal();
            return flyingAnimal;
        }

}
