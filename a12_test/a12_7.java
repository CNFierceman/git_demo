package a12_test;

import java.util.Scanner;

public class a12_7 {

	public static void main(String[] args) 
	{
			Scanner input=new Scanner(System.in);
			System.out.print("Enter a hex number:");
			String bin=input.nextLine();
			System.out.println("The decimal value for hex number "+bin
					+" is "+bin2dec(bin.toUpperCase()));
		}
		public static int bin2dec(String bin)
		{
			int binimalvalue=0;
			for(int i=0;i<bin.length();i++)
			{
				char binchar=bin.charAt(i);
				binimalvalue=binimalvalue*2+binchartodec(binchar);
			}
			return binimalvalue;
		}
		public static int binchartodec(char ch)throws java.lang.NumberFormatException 
		{
			if(ch>='0'&&ch<='1')
				return ch-'0';
			else throw new java.lang.NumberFormatException("您输入的不是十进制");
		}
}
