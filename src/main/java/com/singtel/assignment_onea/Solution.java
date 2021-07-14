package com.singtel.assignment_onea;

public class Solution {
	
	public static void main(String args[]){
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		/**
		 * The method sing() is undefined for the type Bird so compile time issue is seen,
		 * To resolve this , implement sing() method either in super class Animal or Bird subclass
		 * 
		 * */
		//bird.sing();
		
	}

}
