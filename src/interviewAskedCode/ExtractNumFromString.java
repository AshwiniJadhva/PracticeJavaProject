package interviewAskedCode;
/*
 * String str = "pran123test";
 */
public class ExtractNumFromString {
	
	static void getDigits(String str) {
		String digits="";
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				digits= digits+ch;
		}
		System.out.println(digits);
	}
	public static void main(String[] args) {
		getDigits("pran123test jadhav785 0");
		}

}
