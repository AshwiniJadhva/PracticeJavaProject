package interviewAskedCode;

import java.util.Arrays;

//Print first letter of each word in a string

public class FirstCharOfString {
	
	static void getFirstWord(String str) {
		String[] tempStr = str.split(" ");
		char ch[] = new char[tempStr.length];
		for(int index = 0; index<tempStr.length; index++) {
			int length = tempStr[index].length();
			if(length>0) {
				ch[index] = tempStr[index].charAt(length-length);
			}
		}
		System.out.println(Arrays.toString(ch));
	}
	
	public static void main(String[] args) {
		String str = "Ashwini Jadhav Ghorpde";
		getFirstWord(str);
	}

}
