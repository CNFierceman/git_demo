package a1and2_home;

import java.util.Scanner;

public class a2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit=input.nextDouble();
		double celsius=(5.0/9)*(fahrenheit-32);
		System.out.println("Fahrenheit "+fahrenheit+" is "+
		celsius+" in Celsius");
	}

}
