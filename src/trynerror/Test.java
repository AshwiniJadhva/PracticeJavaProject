package trynerror;

public class Test {
	
	static int x = 5;
	private int y=9;
	void m1(int x) {
		this.x = this.x+x;
		System.out.println(x);
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		/*
		 * Test t = new Test(); t.m1(10); t.m1(10); //t.display();
		 */	}

}
