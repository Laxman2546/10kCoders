package com.inheritance;

class Animal {
	public void display() {
		System.out.println("This is an animal");
	}
}
class Dog extends Animal{
}

public class Animalinherit{
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.display();
	}
}