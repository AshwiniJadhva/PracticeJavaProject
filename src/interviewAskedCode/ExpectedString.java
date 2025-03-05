package interviewAskedCode;
/*
 * String str = "a2b3c!d";
 * o/p = aabbcd
 */
public class ExpectedString {
	
	static void getString(String str) {
		String s = "";
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				s = s + str.charAt(index-1);
			else if(Character.isLetter(ch))
				s = s+ch;
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		String str = "a2b3c!d";
		getString(str);
	}

}
