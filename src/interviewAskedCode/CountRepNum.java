package interviewAskedCode;

import java.util.Scanner;

/*
 * int[ ] inputs = {3,5,5,7,8,7,9,7};
 * 
 */
public class CountRepNum {
	
	static int getCount(int arr[], int targetNum) {
		int count = 0;
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]==targetNum) {
				count++;
			}
		}
		return count;
	}
	
	static void checkCount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements in array:");
		for(int index = 0; index<arr.length; index++) {
			arr[index] = scanner.nextInt();
		}
		int count = 0;
		System.out.println("Enter number to be find");
		int num = scanner.nextInt();
		for( int element : arr) {
			if(num == element) {
				count++;
			}
		}
		System.out.println("count of number - "+num+" is "+count);
		scanner.close();
	}
	
	public static void main(String[] args) {
		int[ ] arr = {3,5,5,7,8,7,9,7};
		int count = getCount(arr, 7);
		System.out.println(count);
		
		checkCount();
	}

}
