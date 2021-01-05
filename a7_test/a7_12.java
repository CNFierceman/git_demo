package a7_test;

import java.util.Scanner;

public class a7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int []a=new int[10];
		System.out.print("Enter ten numbers: ");
		for(int i=0;i<10;i++)
			a[i]=input.nextInt();
		reverse(a);
	}
	public static void reverse(int []a) {
		int []b=new int[10];
		for(int i=0;i<10;i++) {
			b[i]=a[9-i];
		}
		System.out.print("reverse: ");
		for(int i:b)
			System.out.print(i+" ");
	}
}
