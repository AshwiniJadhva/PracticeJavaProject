package p1;

public abstract class Test1 {
	
	public int x;
	public void m1() {
		System.out.println("HI");
	}
	
	
	  public Test1(){ 
		  x = 10; System.out.println("x - "+x); 
		 }
	 
	public Test1(int x) {
		this.x = x;
		System.out.println("latest x - "+x);
	}

}
