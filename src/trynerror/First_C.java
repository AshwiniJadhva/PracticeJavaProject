package trynerror;

public class First_C {
	
	void myMethod() {
		System.out.println("Method");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public void First_C() {
		System.out.println("Constructor ");
	}
	
	static
	{
		
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		First_C c = new First_C();
		c.First_C();
		c.myMethod();
	}

}
