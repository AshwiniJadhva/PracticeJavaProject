package interviewAskedCode;
/*
 * String str="123 Welcome to the Capgemini 456";
 * 123+456 = 529
 * 1+2+3+4+5+6 =21
 * 
 */
public class SumOfDigitFromString {
	
	static void getSum(String str) {
		String digit = "";
		int sum = 0;
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				digit = digit+ch;
			}
			else if(Character.isLetter(ch)) {
				if(!digit.equals("")) {
					int temp = Integer.parseInt(digit);
					sum = sum+temp;
					digit = "";
				}
			}
		}
		if(!digit.equals("")) {
			int temp = Integer.parseInt(digit);
			sum = sum+temp;
			digit = "";
		}
		System.out.println(sum);//579
	}
	
	static void getSum1(String str) {
		int sum = 0; 
		String digit = "";
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				digit = digit+ch;
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);//21
	}
	
	
	public static void main(String[] args) {
		String str="123 Welcome to the Capgemini 456";
		getSum(str);
		getSum1(str);
		
	}

}
