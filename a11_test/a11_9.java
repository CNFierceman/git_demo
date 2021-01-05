package a11_test;
import java.util.Scanner;
import java.util.ArrayList;
public class a11_9 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the array size n:");
		int n=input.nextInt();
		ArrayList<Integer>list1=new ArrayList<>();
		ArrayList<Integer>list2=new ArrayList<>();
		int [][]array=new int[n][n];
		System.out.println("The random array is: ");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=(int)(Math.random()*2);
				System.out.print(array[i][j]);
		    }
			System.out.println();
	    }
	
		int row=0;
		int column=0;
		int row_max=0;
		int column_max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(array[i][j]==1)row++;
			}
			if(row>=row_max)row_max=row;
			row=0;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(array[j][i]==1)column++;
			}
			if(column>=column_max)column_max=column;
			column=0;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(array[i][j]==1)row++;
				if(array[j][i]==1)column++;
			}
			if(row==row_max)
				list1.add(i);
			if (column==column_max)
				list2.add(i);
			row=0;
			column=0;
		}
	System.out.print("The largest row index: ");
	for(int i=0;i<list1.size();i++)
		System.out.print(list1.get(i)+" ");
	
	System.out.println();
	
	System.out.print("The largest column index: ");
	for(int i=0;i<list2.size();i++)
		System.out.print(list2.get(i)+" ");
	}
}
