package interviewAskedCode;

import java.util.ArrayList;

/*
 * String[] strArr = {"ashu","ashwini","agastya","ajinkya","ghorpade"};
 * output - min = ashu, ghorpade;
 */

public class FindMaxMinStrLength {
	
	static int getLengthOfStr(String str) {
		return str.length();
	}
	
	static ArrayList<String> getMinMaxStr(String[] arr){
		ArrayList<String> minMaxStrList = new ArrayList<String>();
		int maxLength = arr[0].length();
		int minLength = arr[0].length();
		String maxStr = arr[0];
		String minStr = arr[0];
		for(int index = 1; index<arr.length; index++) {
			int length = arr[index].length();
			if(maxLength<length) {
				maxLength = length;
				maxStr = arr[index];
			}
			else if(minLength>length) {
				minLength = length;
				minStr = arr[index];
			}
		}
		minMaxStrList.add(minStr);
		minMaxStrList.add(maxStr);
		System.out.println("max length -"+maxLength);
		System.out.println("min Length - "+minLength);
		return minMaxStrList;
	}
	
	static String getMax(String[] arr) {
		String maxStr = arr[0];
		for(String str : arr) {
			if(str.length()>maxStr.length()) {
				maxStr = str;
			}
		}
		return maxStr;
	}
	
	public static void main(String[] args) {
		String[] strArr = {"ashu","ashwini","agastya","ajinkya","ghorpade"};
		ArrayList<String> list = getMinMaxStr(strArr);
		System.out.println(list);
		
		String maxStr = getMax(strArr);
		System.out.println("max string is - "+maxStr);
	}

}
