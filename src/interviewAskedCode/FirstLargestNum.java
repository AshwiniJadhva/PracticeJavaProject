package interviewAskedCode;
/*
 * without using condition. get max
 * int num[] = {2,9,1,4,8,3,6,4,7,5};
 */
public class FirstLargestNum {
	
	static void getMax(int[] num) {
		int max = num[0];
		for(int index = 0; index<num.length; index++) {
			max = Math.max(max, num[index]);
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int num[] = {2,9,1,4,8,3,6,4,7,5};
		getMax(num);
	}

}
