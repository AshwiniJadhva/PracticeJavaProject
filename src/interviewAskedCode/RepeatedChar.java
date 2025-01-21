package interviewAskedCode;

import java.util.HashMap;

/*
 * String str = "testing";
 */
public class RepeatedChar {
	
	static void getCount(String str) {
		for(int index = 0; index<str.length(); index++) {
			int count =0;
			char ch = str.charAt(index);
			if(str.indexOf(ch)==index) {
				for(int innerIndex = 0; innerIndex<str.length(); innerIndex++) {
					if(ch ==str.charAt(innerIndex)) {
						count++;
					}
				}
				System.out.println(ch+" - "+count);
			}
		}
	}
	
	static void getFrequencyOfEachCharWithMap(String str) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(map.containsKey(ch)) {
				int count = map.get(ch)+1;
				map.put(ch, count);
			}
			else map.put(ch, 1);
		}
		System.out.println(map);
		
	}
	
	public static void main(String[] args) {
		getCount("testing");
		getFrequencyOfEachCharWithMap("testing");
	}
}
