package a7_test;

import java.util.Scanner;

public class a7_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		System.out.print(getRandom(x));
	}
	public static int getRandom(int numbers) {
		return (int)(Math.random()*54+1);
	}
}
