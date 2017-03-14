package javaPackage;

public class Mainmethod {
	
	static int c;
	static double d;

	public static void main(String[] args){
		
		Mul(2,6);
		Div(3,5);
		System.out.println("The value of c is "+ c);
	
	
}

	private static int Div(int a, int b) {
		// TODO Auto-generated method stub
		c=a/b;
		return c;
		
		
	}

	private static int Mul(int a, int b) {
		// TODO Auto-generated method stub
		c=a*b;
		return c;
		
	}
}
