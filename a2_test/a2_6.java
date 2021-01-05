package a2_test;
import java.util.Scanner;
public class a2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double x=a*b/100;
		double y=a+x;
		System.out.print("The gratuity is $"+x+" and total is $"+y);
		
	}

}
