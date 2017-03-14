package javaPackage;

public class Cars {
		// TODO Auto-generated method stub
		
		public String type = "vehicle";
		public String color = "blue";
		String fuel = "petrol";
		
		
	String getFuel(){
		return fuel;
	}
	
	protected void seats(){
		
		int seats = 4;
		System.out.println("The number of seats is " + seats);
	}

}
