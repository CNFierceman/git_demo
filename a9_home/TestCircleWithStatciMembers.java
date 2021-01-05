package a9_home;

public class TestCircleWithStatciMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Befor craeating objects");
		System.out.println("The number of Circle objects is "+
		CircleWithStaticMembers.number0f0bjects);
		CircleWithStaticMembers c1=new CircleWithStaticMembers();
		System.out.println("\nAfter creating c1");
		System.out.println("c1:radius ("+c1.radius+")"
			+ " and number of Circle objects(" + c1.number0f0bjects + ")");
		CircleWithStaticMembers c2=new CircleWithStaticMembers(5);
		c1.radius=9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1:radius ("+c1.radius+") and number of Circle objects("+c1.number0f0bjects+")");
		System.out.println("c2:radius ("+c2.radius+") and nimber of Circle objects("+c2.number0f0bjects+")");
		
	}

}