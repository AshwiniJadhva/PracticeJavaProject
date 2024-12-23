package trynerror;

public class Data {
	
	public static void main(String[] args) {
		int x=25, y=40;
		System.out.println("Before swapping \nx = "+x+"\ny = "+y);
		x = x+y;
		y = x-y;
		x = x+y;
		System.out.println("after swapping x ="+x+" y ="+y);
	}

}
