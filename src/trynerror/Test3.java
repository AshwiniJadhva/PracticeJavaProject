package trynerror;

public class Test3 {
	
	public static void main(String[] args) {
		int count = 0;
		String t = "pine";
		if(t.equals("pine")) {
			int h = 55;
			count = count+1;
		}
		System.out.println(count);
	}

}
