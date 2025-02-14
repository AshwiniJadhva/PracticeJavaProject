package interviewAskedCode;

import java.util.HashSet;

public class FindDuplicate {
	
	void getDuplicateNum(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num : arr) {
			if(!set.add(num))
				System.out.println(num);
		}
	}
	
	void getDuplicateChar(String str) {
		HashSet<Character> set = new HashSet<Character>();
		char[] chr = str.toCharArray();
		for(char ch : chr) {
			if(!set.add(ch))
				System.out.print(ch+" ");
		}
	}
	
	public static void main(String[] args) {
		FindDuplicate duplicate =new FindDuplicate();
		int[] arr = {2,1,2,4,3,3,5,4,4};
		duplicate.getDuplicateNum(arr);
		
		duplicate.getDuplicateChar("Ashwini Jadhav");
	}

}
