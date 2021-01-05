package a9_test;

public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	LinearEquation(double a,double b,double c,double d,double e,double f){
		this.a=a;this.b=b;this.c=c;this.d=d;this.e=e;this.f=f;
	}
	public double geta() {
		return this.a;
	}
	public double getb() {
		return this.b;
	}
	public double getc() {
		return this.c;
	}
	public double getd() {
		return this.d;
	}
	public double gete() {
		return this.e;
	}
	public double getf() {
		return this.f;
	}
	public boolean isSolved() {
		if((this.a*this.d-this.b*this.c)!=0)
			return true;
		else
			return false;
	}
	public double getX() {
		double x=(this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		return x;
	}
	public double getY() {
		double y=(this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		return y;
	}
}
