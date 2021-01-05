package a7_test;

import java.util.ArrayList;
import java.util.Scanner;

public class a7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int number=input.nextInt();
		int best=0;
		String str;
		System.out.print("Enter "+number+" scores: ");
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<number;i++) {
			int grade =input.nextInt();
			list.add(grade);
			if(grade>best)
				best=list.get(i);
		}
		for(int i=0;i<number;i++) {
			int grade=list.get(i);
			if(grade>=best-10)
				str="A";
			else if(grade>=best-20)
				str="B";
			else if(grade>=best-30)
				str="C";
			else
				str="D";
			System.out.println("Student "+i+" score is "+list.get(i)+"and grade is "+str);
		}
	}

}
