package a9_home;

public class CircleWithStaticMembers {
double radius;
static int number0f0bjects = 0;
CircleWithStaticMembers(){
	radius = 1;
	number0f0bjects++;
}
CircleWithStaticMembers(double  newRadius){
	radius = newRadius;
	number0f0bjects++;
}
static int getNumber0f0bjects() {
	return number0f0bjects;
}
double getArea() {
	return radius*radius*Math.PI;
}
}
