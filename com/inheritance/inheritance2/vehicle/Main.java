package com.inheritance.inheritance2.vehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car("Toyota","Corolla",2022,4);
		((Car)car).displayCarInfo();
		
		Vehicle truck = new Truck("Ford","F-150",2021,1000);
		((Truck)truck).displayTruckInfo();
		
		Vehicle motorcycle = new Motorcycle("Harley","Street-glide", 2023, true);
		((Motorcycle)motorcycle).displayMotorcycleInfo();
	}

}
