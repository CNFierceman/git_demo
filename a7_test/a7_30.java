package a7_test;

import java.util.Scanner;

public class a7_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int n=input.nextInt();
		int []a=new int[n];
		int count=1;
		int max_count=0;
		System.out.print("Enter the values: ");
		for(int i=0;i<n;i++) 
			a[i]=input.nextInt();
		int t=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]==t)
				count++;
			else{
				count=1;
				t=a[i];
			}
			if(count>max_count)max_count=count;
		}
		if(max_count>=4)
			System.out.print("The list has consecutive fours");
		else
			System.out.print("The list has no consecutive fours");
	}
}
