package practice;

public class SecondLargeNum {
	
	static int getSecondMaxNum(int[] num) {
		int max = num[0];
		int secondMax = 0;
		for (int index = 1; index < num.length; index++) {
			if (max < num[index]) {
				secondMax = max;
				max = num[index];
			}
			else if(num[index]>secondMax &&max!=num[index])
				secondMax = num[index];
			}
		return secondMax;
	}
	public static void main(String[] args) {
		int[] arr = 
			{111,7,10,33,43,55,105,97,11,3,100,110,112};
		//{50,23,43,1,6,7,8};
		int  output = getSecondMaxNum(arr);
		System.out.println(output);
		
	}

}
