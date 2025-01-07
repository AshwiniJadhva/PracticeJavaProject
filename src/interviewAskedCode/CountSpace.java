package interviewAskedCode;
/*
 * String str = "ashwini jadhav ghorpde";
 * o/p =3;
 */
public class CountSpace {
	
	static void getSpaceCount(String str) {
		int count = 0;
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(ch==' ')
				count++;
		}
		System.out.println("space count is - "+count);
	}
	
	public static void main(String[] args) {
		getSpaceCount("ashwini jadhav ghorpde ");
	}

}
