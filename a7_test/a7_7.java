package a7_test;
import java.util.ArrayList;
import java.util.Scanner;
public class a7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[100];
		for(int i=0;i<100;i++) {
			int num=(int)(Math.random()*10);
			a[num]++;
		}
		for(int i=0;i<10;i++)
			System.out.println(i+"出现的次数为： "+a[i]);
	}

}
