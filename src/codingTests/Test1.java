package codingTests;

/*Program 1:Given an array of integers nums and an integer target,return index of the two numbers such that they add up to the target.

Input:nums=[2,11,15,7,4],target=9

Output:[0,3]

Output:Because nums[0]+nums[3]==9,we return[0,3].

Program 2:WAP to provide the difference between a Younger and an elder member of the family.Age is provided in the form of an array.

Sample Input:7 12 56 62 25

Sample Output:55
*/
public class Test1 {
	
	static int[] getIndex(int[] numbers, int targetNum) {
		int[] IndexNum = new int[2];
		for(int index = 0; index<numbers.length; index++) {
			for(int innerIndex = 1; innerIndex<numbers.length;innerIndex++ ) {
				if(numbers[index]+numbers[innerIndex]==targetNum) {
					IndexNum[0] = innerIndex;
					IndexNum[1] = index;
					break;
				}
			}
			
		}
		return IndexNum;
	}
	
	static int getDiffBetMinMax(int[] number) {
		int maxNum = number[0];
		int minNum = number[0];
		int diff = 0;
		for(int index=0; index<number.length; index++) {
			if(maxNum<number[index]) {
				maxNum = number[index];
			}
			else if(minNum>number[index]) {
				minNum = number[index];
			}
		}
		System.out.println("Min num - "+minNum);
		System.out.println("Max Num - "+maxNum);
		diff= maxNum - minNum;
		return diff ;
	}
	
	public static void main(String[] args) {
		int[] arr= {2,11,15,7,4};
		int[] output = getIndex(arr, 15);
		for(int index = 0; index<output.length; index++) {
			System.out.println(output[index]);
		}
		int diff = getDiffBetMinMax(arr);
		System.out.println(diff);
	}

}
