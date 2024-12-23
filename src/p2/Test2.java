package p2;

import p1.Test1;

public class Test2 extends Test1{
	
	
	  public Test2(){
		  super(50);
	  }
	 
	 

	public Test2(int x) { 
		super(70);
		//int x=0;
	}

	

	public static void main(String[] args) {
		//Test1 t1 = new Test2();
		//Test1 t = new Test1();
		//t1.m1();
		Test1 t = new Test2(90);
		Test2 t2 = new Test2(20);
		Test2 t2_1 = new Test2();
		
	}

}
