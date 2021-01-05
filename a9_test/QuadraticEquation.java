package a9_test;

public class QuadraticEquation 
{
	private double a;
	private double b;
	private double c;
	
	QuadraticEquation(double a, double b, double c) 
	{
	this.a=a;
	this.b=b;
	this.c=c;
	}
	public double getA() 
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC() 
	{
		return c;
	}
	
	public double getDiscriminant() 
	{
	double p=Math.pow(b, 2)-4*a*c;
	return p;
	}
	
	public double getRoot1() 
	{
	double r1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a); 
	return r1;
	}
	
	public double getRoot2() 
	{
	double r2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a); 
	return r2;
	}

}
