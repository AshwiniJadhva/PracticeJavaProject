package codingTests;

import java.util.ArrayList;
import java.util.List;

/*
 * get the duplicate from given array
 * int[] arr = {1,2,2,3,4,5,1,6,6,7};
 * output = {2,1,6}
 */

public class FindDupliacte {
	
	
	static List<Integer> getDuplicateNum(int arr[]){
		int duplicateCount = 0;
		List<Integer> duplicateList = new ArrayList<Integer>();
		for(int index = 0; index<arr.length; index++) {
			for(int innerIndex = index+1; innerIndex<arr.length; innerIndex++) {
				if(arr[index]==arr[innerIndex]) {
					if(!duplicateList.contains(arr[index])) {
					duplicateList.add(arr[index]);
					duplicateCount++;
					break;
					}
				}
			}
		}
		System.out.println("duplicate cunt in arr are - "+duplicateCount);
		return duplicateList;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,9,9,99,99,5,5,5};
		List<Integer> duplicateNumList = getDuplicateNum(arr);
		System.out.println(duplicateNumList);
	}

}
