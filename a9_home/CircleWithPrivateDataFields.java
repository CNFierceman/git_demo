package a9_home;

public class CircleWithPrivateDataFields {
private double radius =1;
private static int number0f0bjects=0;
public CircleWithPrivateDataFields() {
	number0f0bjects++;
}
public CircleWithPrivateDataFields(double newRadius) {
	radius = newRadius;
	number0f0bjects++;
}
public double getRadius() {
	return radius;
}
public void setRadius(double newRadius) {
	radius = (newRadius>=0)?newRadius :0;
}
public static int getNumber0f0bjects() {
	return number0f0bjects;
}
public double getArea() {
	return radius*radius*Math.PI;
}
}
