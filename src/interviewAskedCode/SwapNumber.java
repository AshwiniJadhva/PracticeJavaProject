package interviewAskedCode;

public class SwapNumber {
	
	void swapNumWithTemp(int x, int y) {
		System.out.println("before swapping X - "+x+" & Y - "+y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("after swapping X - "+x+" & Y - "+y);
	}
	
	void swapNumWithoutTemp(int x, int y) {
		System.out.println("before  swapping X - "+x+" & Y - "+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("after swapping X - "+x+" & Y - "+y);
		
	}
	
	public static void main(String[] args) {
		SwapNumber swapNumber = new SwapNumber();
		swapNumber.swapNumWithTemp(10, 5);
		System.out.println("------------------------------");
		swapNumber.swapNumWithoutTemp(4,5);
	}

}
