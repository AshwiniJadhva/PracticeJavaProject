package codingTests;

/*
 * get the duplicate from given array
 * int[] arr = {1,2,2,3,4,5,1,6,6,7};
 * output = {2,1,6}
 */

public class FindDupliacte {
	static int count;
	static int[] getDuplicate(int[] arr) {
		int[] duplicateArray = new int[arr.length];
		//int count =0;
		for(int index = 0; index<arr.length; index++) {
			for(int innerIndex = index+1; innerIndex<arr.length; innerIndex++) {
				if(arr[index]==arr[innerIndex]) {
					duplicateArray[count] = arr[innerIndex];
					count++;
					break;
				}
					
			}
		}
		return duplicateArray;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5,1,6,6,7,7};
		int[] duplicateNum = getDuplicate(arr);
		for(int index = 0; index<count; index++) {
			System.out.println(duplicateNum[index]);
		}
	}

}
