package interviewAskedCode;

import java.util.Arrays;

/*
 * int inputArray[] = { 1, 0, 2, 0, 3, 0, 0, 0 };
 * output - {1,2,3,0,0,0,0,0};
 */
public class ShiftAllZero {
	
	static int[] shiftZeroToRight(int[] arr) {
		int[] updatedArray = new int[arr.length];
		int count = 0;
		for(int index = 0; index<arr.length; index++) {
			 if(arr[index]!=0){
				updatedArray[count] = arr[index];
				count++;
			}
			
		}
		return updatedArray;
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 0, 0 ,4,5,0,6,0,7,8,0,9};
		int[] output = shiftZeroToRight(arr);
		String temp = Arrays.toString(output);
		System.out.println(temp);
		
		
	}

}
