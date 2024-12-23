package trynerror;

public class ExceptionT {
	public static void main(String[] args) {
		try {
			
			int a = 0;
			int b = 5;
			int c = b/a;
			System.out.println("hello");
			
		}catch(Exception e) {
			System.out.println("world");
		}
	}
	

}
