package a11_test;

import java.util.Scanner;
import java.util.ArrayList;
public class a11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<>();
		System.out.print("Enter ten integers: ");
		for(int i=0;i<10;i++)
			list.add(input.nextInt());
		removeDuplicate(list);
	}
	public static void removeDuplicate(ArrayList<Integer>list)
	{
		ArrayList<Integer>newlist=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			if(!newlist.contains(list.get(i)))
			newlist.add(list.get(i));
		}
		System.out.print("The distinct integers are");
		for(int i=0;i<newlist.size();i++)
			System.out.print(" "+newlist.get(i));
	}
}
