package a12_test;
import java.util.*;
public class a12_6 {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a hex number:");
		String hex=input.nextLine();
		System.out.println("The decimal value for hex number "+hex
				+" is "+hextodec(hex.toUpperCase()));
	}
	public static int hextodec(String hex)
	{
		int decimalvalue=0;
		for(int i=0;i<hex.length();i++)
		{
			char hexchar=hex.charAt(i);
			decimalvalue=decimalvalue*16+hexchartodec(hexchar);
		}
		return decimalvalue;
	}
	public static int hexchartodec(char ch)throws java.lang.NumberFormatException 
	{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= '0' && ch <= '9') 
			return ch - '0';
		else throw new java.lang.NumberFormatException("您输入的不是十六进制数");
	}
}
