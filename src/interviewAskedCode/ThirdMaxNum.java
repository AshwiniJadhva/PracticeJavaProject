package interviewAskedCode;
/*
 * int arr = {2,4,1,6,5,9,7,8,3};
 */
public class ThirdMaxNum {
	
	static void getThirdMaNum(int arr[]) {
		int max = arr[0];
		int secondMax = 0;
		int thirdMax = 0;
		for(int index =1; index<arr.length; index++) {
			if(arr[index]>max) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[index];
			}
			else if(arr[index]>secondMax) {
				thirdMax = secondMax;
				secondMax = arr[index];
			}
			else if(arr[index]>thirdMax) {
				thirdMax = arr[index];
			}
		}
		System.out.println(thirdMax);
	}
	public static void main(String[] args) {
		int arr[] = {-9,-4,-1,-6,-5,-2,-7,-8,-3};
		int arr1[] = {2,4,1,6,5,9,7,8,3};
		getThirdMaNum(arr);
		getThirdMaNum(arr1);
	}

}
