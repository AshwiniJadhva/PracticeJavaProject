package codingTests.codingTest1;

/*
 * CODING EXAM - 1 : 18TH APRIL 2021

Program 1 : 
Given an array of integers nums and an integer target, return index of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].

 */

public class ReturnIndex {
	
	static void getIndex(int[] arr, int targetNum) {
		int[] output = new int[2];
		for(int index = 0; index<arr.length; index++) {
			for(int innerIndex = 0; innerIndex<arr.length; innerIndex++) {
				if(arr[index]+arr[innerIndex]==targetNum) {
					output[0] = innerIndex;
					output[1] = index;
				}	
			}
		}
		System.out.println(output[0]+" "+output[1]);
	}
	
	public static void main(String[] args) {
		int[] arr = {6,7,43,2,5,6,7};
		getIndex(arr,45);
	}

}
