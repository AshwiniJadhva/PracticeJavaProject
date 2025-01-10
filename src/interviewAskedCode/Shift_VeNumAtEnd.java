package interviewAskedCode;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 2. shift the -ve number at end without chnaging other number position
 * int[] arr = {2,4,-1,1,-5,-9,9,3};
 * o/p = {2,4,9,3,-1,-5,-9};
 */
public class Shift_VeNumAtEnd {
	
	static ArrayList<Integer> shift_AllVeNum(int[] arr) {
		int[] updatedArr = new int[arr.length];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]>0) {
				list.add(arr[index]);
			}
			
		}
		return list;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,-1,1,-5,-9,9,3};
		ArrayList<Integer> list = shift_AllVeNum(arr);
		System.out.println(list);
	}

}
