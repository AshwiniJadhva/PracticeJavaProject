package interviewAskedCode;

///import java.util.Arrays;

//print the elements of an array in reverse order  

public class ReverseArray {
	
	static void reverseArry(int arr[]) {
	
		int temp = arr.length;
		for(int index = temp-1; index>=0; index--) {
			System.out.print(arr[index]+" ");
			
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		reverseArry(arr);
	}

}
