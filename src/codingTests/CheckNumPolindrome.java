package codingTests;

/*
 * check given num is polindrom or not;
 * input -121
 * output - 121 yes
 */

public class CheckNumPolindrome {
	
	static boolean isNumPolindrome(int num) {
		int temp = num;
		int revNum = 0;
		//boolean flag = true;
		while(num!=0) {
			int digit = num%10;
			revNum = revNum *10+digit;
			num= num/10;
			
		}
		if(temp == revNum)
			return true;
		else return false;
		
	}
	
	public static void main(String[] args) {
		boolean falg = isNumPolindrome(121);
		System.out.println(falg);
	}

}
