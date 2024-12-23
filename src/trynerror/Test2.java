package trynerror;

public class Test2 {
	static int x;
	int b;
	 void m1(int x) {
		this.x=x+x;
	}
	 void display() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.m1(10);
		t2.m1(10);
		t2.display();
		Test t = new Test();
		t.display();
	}

}
