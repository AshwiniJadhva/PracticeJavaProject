package interviewAskedCode;
/*
 * int[] arr = {1,2,7,3,4,8,5,7,9};
 */
public class FindSecondLargesNum {
	
	static int getSecondLargestNum(int[] arr) {
		int max = arr[0];
		int secondLargest = 0;
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]>max) {
				secondLargest = max;
				max = arr[index];
			}
			else if(secondLargest<arr[index] && arr[index] !=max)
				secondLargest =arr[index];
			
				
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,2,7,3,9,8,5,1,9,10};
		int num = getSecondLargestNum(arr);
		System.out.println(num);
	}

}
