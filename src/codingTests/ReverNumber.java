package codingTests;

/*
 * Reverse the number 
 * inpit= 12345
 * output-54321
 */

public class ReverNumber {
	
	static int getRevNum(int num) {
		int revNum = 0;
		while(num!=0) {
			int digit = num%10;
			revNum = revNum*10+digit;
			num= num/10;
		}
		return revNum;
	}
	
	public static void main(String[] args) {
		int output = getRevNum(54321);
		System.out.println(output);
	}

}
