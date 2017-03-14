package javaPackage;

public class Stringmethods {
	public static void main(String[] args){
		
	String st1 = "This is exciting to start java";
	String st2 = "California is always fun to roam";
	
	System.out.println("Is string1 is equal to string2--- " + st1.equals(st2));
	
	System.out.println("change string1 to lower case---" +  st1.toLowerCase());
	
	System.out.println("Change string1 to upper case---" + st1.toUpperCase());
	
	System.out.println("Find index of char to is  "+ st1.indexOf("t"));
	
	System.out.println("Find the index of string fun---- "+ st2.indexOf("fun"));
	
	System.out.println("Concatenation of two strings ---" + st1.concat(st2));
	
	System.out.println("Length of the string " + st1.length());
	
	
	
	
	
		
		
	}

}
