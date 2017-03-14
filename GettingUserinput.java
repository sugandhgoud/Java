package javaPackage;

import java.util.Scanner;

public class GettingUserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter line of Text :");
		
		String line = input.nextLine();
		
		System.out.println("The line is : " + line);
	}
}
