package javaOppsConcepts;

public class MethodOverridingInJava {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();

		Vehicle ve = new Bike();
		ve.run();

	}

}

class Vehicle {
	public static void run() {
		System.out.println("Vehical is running");
	}
}

class Bike extends Vehicle {

	public static void run() {
		System.out.println("Bike is running");
	}

}