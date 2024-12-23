package practice;



//String str = 123asbsd121;
public class GetSum {
	public static void main(String[] args) {
		String str = "123asbsd121";
		int sum = 0;
		
		String digitStr = "";
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				digitStr = digitStr+ch;
			else {
				if(!digitStr.equals("")) {
					int tempNum = Integer.parseInt(digitStr);
					sum = sum+tempNum;
					digitStr ="";
				}
			}
			
		}
		if(!digitStr.equals("")) {

			int tempNum = Integer.parseInt(digitStr);
			sum = sum+tempNum;
			digitStr ="";
		
		}
		System.out.println(sum);
		System.out.println("HI");
		System.out.println('A'+'B'+'C');
	}

}
