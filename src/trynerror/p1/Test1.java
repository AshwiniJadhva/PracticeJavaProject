package trynerror.p1;

public class Test1 {
	
	int x = 10;
	private int y  = 20;
	public void display(int p) {
		System.out.println("x - "+x);
		if(p%2==0) {
			System.out.println("given odd num");
			System.out.println("y - "+y);
		}
		else {
			y = 0;
			System.out.println("given even num");
			System.out.println(" y - "+y);
		}
	}

}
