package com.animal;

class Animal {

	public void makeSound() {
		System.out.println("The animal makes a sound.");
		
	}
	
}

class Dog extends Animal {

	public void makeSound() {
		System.out.println("The dog barks ......");
	}
 }


public class Animal_Main extends Animal {
	public void makeSound() {
		System.out.println("The Cat meows .......");
		
	}
	
	public static void main(String [] args) {
		Animal a1 = new Animal();
		Dog d1 = new Dog();
		Animal_Main c1 = new Animal_Main();
		
		a1.makeSound();
		d1.makeSound();
		c1.makeSound();
		
	}
}
