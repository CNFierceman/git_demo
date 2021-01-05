package a11_test;
import java.util.Scanner;
import java.util.ArrayList;

public class a11_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Double>listx=new ArrayList<>();
		ArrayList<Double>listy=new ArrayList<>();
		System.out.print("Enter the number of the points: ");
		int point_num=input.nextInt();
		System.out.println("Enter the coordinate of the points:");
		for(int i=0;i<point_num;i++)
		{
			listx.add(input.nextDouble());
			listy.add(input.nextDouble());
		}
		System.out.println(listx.toString()+listy.toString());
		double sum=0;
		for(int i=0;i<point_num-1;i++)
			sum=sum+(listx.get(i)*listy.get(i+1)-listx.get(i+1)*listy.get(i));
		
		double square=(Math.abs(sum+(listx.get(point_num-1))*listy.get(0)-(listx.get(0)*listy.get(point_num-1))))/2;
		System.out.print("The total area is "+square);
	}
}
