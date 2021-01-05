package a12_test;

public class a12_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = new int[Integer.MAX_VALUE];
		} catch(OutOfMemoryError err) {
			System.out.println(err.getMessage());
		}
	}

}
