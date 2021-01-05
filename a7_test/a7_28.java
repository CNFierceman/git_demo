package a7_test;

import java.util.Scanner;

public class a7_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int []a=new int[10];
		System.out.print("Enter ten number: ");
		for(int i=0;i<10;i++)
			a[i]=input.nextInt();
		System.out.println("所有的2个数组合: ");
		for(int i=0;i<10;i++) 
			for(int j=i+1;j<10;j++) 
				System.out.println("("+a[i]+","+a[j]+")");
	}

}
