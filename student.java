package javaPackage;

public class student {
	

	public static void main (String[] args){
		
		// creating objects
		
	student std1 = new student("sugandh");
	student std2 = new student("jayanth");
	
	}
	
	public student (String name){
		
   String stdname = name;
   System.out.println("The name is " + stdname);
	}

}
