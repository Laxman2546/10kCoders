package com.inheritance.inheritance2.vehicle;

public class Vehicle {
	String make;
	String model;
	int year;
	
public Vehicle(String make,String model,int year) {
		this.make = make;
		this.model = model;
		this.year  = year;
	}
	public void displayInfo() {
		System.out.print(make+" "+ model+ " "+ year);
	}
}
class Car extends Vehicle{
	int numberOfDoors;
	public Car(String make, String model, int year,int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	public void displayCarInfo() {
		System.out.println(super.make+" "+super.model+" "+super.year);
		System.out.println("Number of doors: " + numberOfDoors);
	}

}
class Truck extends Vehicle{
	int cargoCapacity;
	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	public void displayTruckInfo() {
		System.out.println(super.make+" "+super.model+" "+super.year);
		System.out.println("cargoCapacity: "+cargoCapacity);
	}
}
class Motorcycle extends Vehicle{
	boolean hasSidecar;
	public Motorcycle(String make, String model, int year,boolean hasSidecar) {
		super(make, model, year);
		this.hasSidecar = hasSidecar;
	}
	public void displayMotorcycleInfo() {
		System.out.println(super.make+" "+super.model+" "+super.year);
		System.out.println("hasSidecar: "+ hasSidecar);
	}
}
