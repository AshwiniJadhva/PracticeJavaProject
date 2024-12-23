package trynerror;

import java.util.ArrayList;

public class Output {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(1,"D");
		System.out.println(list);
	}

}
