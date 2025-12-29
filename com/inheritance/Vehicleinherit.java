package com.inheritance;

class Vehicle{
	public void run() {
		System.out.println("Vehicle is running");
	}
}
class Car extends Vehicle{
	public void speed() {
		System.out.println("Car is moving at 80 km/h");
	}
}

public class Vehicleinherit {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		car.speed();
	}
}
