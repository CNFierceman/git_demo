package a7_test;

import java.util.Scanner;

public class a7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double []a=new double[10];
		for(int i=0;i<10;i++)
			a[i]=input.nextDouble();
		System.out.println("The mean is "+mean(a));
		System.out.println("The standard deviation is "+deviation(a));
	}
	public static double deviation(double[] x) {
		double sum=0;
		double mean=mean(x);
		for(double i:x)
			sum+=(i-mean)*(i-mean);
		double d=Math.sqrt(sum/(x.length-1));
		return d;
	}
	public static double mean(double[] x) {
		double sum=0;
		for(double i:x) 
			sum+=i;
		return sum/x.length;
	}
}
