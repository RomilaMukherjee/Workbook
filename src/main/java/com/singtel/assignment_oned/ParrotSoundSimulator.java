package com.singtel.assignment_oned;

public class ParrotSoundSimulator {

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.setSoundType(new DogSound());
        parrot.makeDifferentSound();

        parrot.setSoundType(new CatSound());
        parrot.makeDifferentSound();

        parrot.setSoundType(new RoosterSound());
        parrot.makeDifferentSound();

    }
}
