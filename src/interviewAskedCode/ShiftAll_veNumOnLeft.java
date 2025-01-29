package interviewAskedCode;

import java.util.Arrays;

/*
 * shift the -ve number at end without chnaging other number position
 */

public class ShiftAll_veNumOnLeft {
	
	static int[] shiftNum(int[] arr) {
		int[] updatedArr = new int[arr.length];
		int count = 0;
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]>0) {
				updatedArr[count] = arr[index];
				count++;
			}
		}
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]<0) {
				updatedArr[count] = arr[index];
				count++;
			}
		}
		return updatedArr;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,-1,1,-5,-9,9,3};
		int[] output = shiftNum(arr);
		System.out.println(Arrays.toString(output));
	}

}
