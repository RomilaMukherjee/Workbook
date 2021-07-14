package com.singtel.assignment_oneb;

public class BirdSimulator {
	public static void main(String args[]){
		//Duck
		Duck duck = new Duck();
		duck.setBirdSoundAction(new DuckSound());
		duck.setBirdSwimAction(new DuckSwimDeep());
		duck.makeSound();
		duck.swimDeep();
		duck.walk();

		
		//Chicken
		Chicken chicken = new Chicken();
		chicken.setBirdSoundAction(new ChickenSound());
		chicken.makeSound();
		chicken.walk();
		
	}

}
