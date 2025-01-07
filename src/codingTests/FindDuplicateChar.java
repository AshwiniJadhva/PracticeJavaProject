package codingTests;

import java.util.ArrayList;

public class FindDuplicateChar {
	
	static ArrayList<Character> getDuplicate(String str){
		ArrayList<Character> dupliacteCharList = new ArrayList<Character>();
		int dudpicateCount = 0;
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			for(int innerIndex =index+1; innerIndex<str.length(); innerIndex++) {
				char ch2 = str.charAt(innerIndex);
				if(ch2==ch) {
					if(!dupliacteCharList.contains(str.charAt(innerIndex))) {
						//if(str.indexOf(ch)==index) {
							dudpicateCount++;
							dupliacteCharList.add(str.charAt(innerIndex));
							System.out.println(str.charAt(index)+" - "+dudpicateCount);
							break;
						//}
					}
				}
			}
		}
		System.out.println(dudpicateCount);
		return dupliacteCharList;
	}
	
	public static void main(String[] args) {
		String str = "ashwini jadhav";
		ArrayList<Character>list = getDuplicate(str);
		System.out.println(list);
	}

}
