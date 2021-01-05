package a12_test;

import java.util.Scanner;

public class a12_9 {
	public static void main(String[] args) throws HexFormatException2
	{
			Scanner input=new Scanner(System.in);
			System.out.print("Enter a hex number:");
			String bin=input.nextLine();
			System.out.println("The decimal value for hex number "+bin
					+" is "+bin2dec(bin.toUpperCase()));
		}
		public static int bin2dec(String bin)throws HexFormatException2
		{
			int binimalvalue=0;
			for(int i=0;i<bin.length();i++)
			{
				char binchar=bin.charAt(i);
				binimalvalue=binimalvalue*2+binchartodec(binchar);
			}
			return binimalvalue;
		}
		public static int binchartodec(char ch)throws HexFormatException2
		{
			if(ch>='0'&&ch<='1')
				return ch-'0';
			else throw new HexFormatException2(ch);
		}
}
class HexFormatException2 extends Exception
{
	private char ch;
	HexFormatException2(char ch)
	{
		super("您输入的输入不是二进制"+ch);
	}
	public char getch()
	{
		return ch;
	}
}
