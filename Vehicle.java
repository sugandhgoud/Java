package javaPackage;

public class Vehicle {

	public static void main(String[] args) {

		// create two objects

		Vehicle bicycle = new Vehicle("Black", 5, 4000, 12.5);
		Vehicle motorcycle = new Vehicle("Red", 10, 5222, 42.5);
		Vehicle jayavardhan = new Vehicle(100, 5000, 80.50, "Black");
		 
	  
		
	}


	public Vehicle(String color, int speed, int rpm, double rate) {

		System.out.println("The color is " + color + " The speed of vehicle is " + speed + " The Rpm is " + rpm
				+ " The rate of car is " + rate);

	}

	public Vehicle(int speed, int rpm, double rate, String color) {
		System.out.println("The jay vehicle speed is " + speed + " Rpm is " + rpm + "The rate is " + rate
				+ " The color is " + color);
	}

}
