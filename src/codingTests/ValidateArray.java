package codingTests;

/*
 * WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0

 */

public class ValidateArray {
	
	static void processArray(int arr[]) {
		int sum = 0;
		String indexNum = "";
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]!=6 && arr[index]!=9) {
				if(indexNum.equals(""))
					sum =  sum+arr[index];
				else if(indexNum.equals("start") ) {
					sum = sum+0;
					
				}
				else if(indexNum.equals("end"))
					sum =  sum+arr[index];
				
			}
			else if(arr[index]==6)
				indexNum = "start";
			else if(arr[index]==9)
				indexNum = "end";
		}
		System.out.println(sum);
		
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {6,1,4,5,9};
		processArray(arr);
	}

	
}
