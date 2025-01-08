package interviewAskedCode;

import java.util.ArrayList;

/*
 * get secodn last char or each word;
 * String a = "I am an automation tester"; 
 * o/p = a,a,o,e;
 */
public class SecondLastChar {
	
	static char getChar(String str) {
		char ch = ' ';
		for(int index = 0; index<str.length(); index++) {
			int temp = str.length();
			if(temp==1) {
				temp = str.length()-1;
				ch = str.charAt(temp);
			}
			else if(temp>1) {
				temp = str.length()-2;
				ch = str.charAt(temp);
			}
		}
		return ch;
	}
	
	static ArrayList<Character> getSecondLastChar(String str) {
		ArrayList<Character> charList = new ArrayList<Character>();
		String[] tempStr = str.split(" ");
		for(int index = 0; index<tempStr.length; index++) {
			if(tempStr[index].length()>1) {
				char ch=getChar(tempStr[index]);
				charList.add(ch);
			}
			
			else if(tempStr[index].length()==1) {
				char ch=getChar(tempStr[index]);
				charList.add(ch);
			}
		}
		return charList;
	}
	
	public static void main(String[] args) {
		String a = "I am an automation tester";
		ArrayList<Character> list = getSecondLastChar(a);
		System.out.println(list);
	}

}
