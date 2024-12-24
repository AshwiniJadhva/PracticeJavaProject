package codingTests.codingTest2;

/*
 * Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
 */

public class GetSumFromString {
	
	static void getSum(String str) {
		String digits = "";
		int sum = 0;
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				digits = digits+ch;
			else if(Character.isLetter(ch)) {
				if(!digits.equals("")) {
					int temp = Integer.parseInt(digits);
					sum = sum+temp;
				}
				digits = "";
			}		
		}
		if(!digits.equals("")) {
			int temp = Integer.parseInt(digits);
			sum = sum+temp;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		getSum("12h14i4w8sdc15");
	}

}
