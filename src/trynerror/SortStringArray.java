package trynerror;

import java.util.ArrayList;

public class SortStringArray {
	
	static  ArrayList<String> getSortedList(String[] str){
        ArrayList<String> list = new ArrayList<String>();
        int maxLength = 0;
        for(int index = 1; index<str.length; index++){
           int tempLength =  str[index].length();
           if(maxLength<tempLength){
               maxLength = tempLength;
               list.add(str[index]);
           }
        }
        return list;
    }
	
	public static void main(String[] args) {
		String str[] = {"abcef","ab","abcd","abc","a"};
	       ArrayList<String> list =  getSortedList(str);
	       System.out.println(list);
	}

}
