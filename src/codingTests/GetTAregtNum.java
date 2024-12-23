package codingTests;

/*
 * int[] arr ={1,2,3,4,5};
 * targetnum = ;9
 *o/p = 4,5
 */

public class GetTAregtNum {
	
	static int[] getNum(int[] arr) {
		int[] output = new int[2];
		for(int index = 0; index<arr.length; index++) {
			for(int innerIndex = 0; innerIndex<arr.length; innerIndex++) {
				if(arr[index]+arr[innerIndex]==9) {
					output[0] = arr[index];
					output[1] = arr[innerIndex];
				}	
							
			
			}
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5};
		int[] output = getNum(arr);
		for(int index = 0; index<output.length; index++) {
			System.out.println(output[index]);
		}
	}

}
