package a9_test;
import java.util.Scanner;
public class a9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入a、b和c的值：");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		input.close();
		
		QuadraticEquation object=new QuadraticEquation(a,b,c);
		
		
		System.out.println("a的值："+object.getA());
		System.out.println("b的值："+object.getB());
		System.out.println("c的值："+object.getC());
		
		if(object.getDiscriminant()>0)
			System.out.println("判别式>0,方程有两个根,分别为  r1:"+object.getRoot1()+" r2:"+object.getRoot2());
		else if(object.getDiscriminant()==0)
			System.out.println("判别式=0,方程只有一个根 r:"+object.getRoot1());
		else
			System.out.println("The equation has no roots.");

	}

}
