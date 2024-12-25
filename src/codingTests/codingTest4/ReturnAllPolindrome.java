package codingTests.codingTest4;

/*
 * Programming Test - 4 : 12th May'2021

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN
 */

public class ReturnAllPolindrome {
	
	static String getRevString(String str) {
		String revStr = "";
		for(int index = 0; index<str.length(); index++) {
			revStr = str.charAt(index)+revStr;
		}
		return revStr;
	}
	
	static String getPolindromeStr(String str) {
		String polindromeStr = "";
		String[] temp = str.split(" ");
		for(int index = 0; index<temp.length; index++) {
			String revStr = getRevString(temp[index]);
			if(revStr.equals(temp[index]))
				polindromeStr = polindromeStr+" "+temp[index];
		}
		return polindromeStr.trim();
	}
	
	public static void main(String[] args) {
		String output = getPolindromeStr("Hi MAM hello NamaN techno");
		System.out.println(output);
	}

}
