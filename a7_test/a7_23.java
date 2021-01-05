package a7_test;

import java.util.Scanner;

public class a7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int []a=new int[100];
		for(int i=0;i<100;i++) {
			for(int j=i;j<100;j+=i+1) {
				if(a[j]==1)a[j]=0;
				else a[j]=1;
			}
		}
		System.out.print("开着的柜子：");
		for(int i=0;i<100;i++) {
			if(a[i]==1)
				System.out.print(i+" ");
		}
			
	}

}
