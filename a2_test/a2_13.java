package a2_test;
import java.util.Scanner;
public class a2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the monthly saving amount:");
		double a=input.nextDouble();
		double x=a;
		for(int i=1;i<=5;i=i+1)
		{
			x=(a+x)*(1+0.00417);
		}
		System.out.print("After the sixth month, the account value is $");
		System.out.print(String.format("%.2f", x));
	}

}
