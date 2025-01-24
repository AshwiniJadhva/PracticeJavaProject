package interviewAskedCode;
/*
 * String str = "Ashwini Jadhav"
 */
public class PrintDuplicateChar {
	
	static void getDuplicate(String str) {
		for(int index = 0; index<str.length(); index++) {
			int count = 0;
			char ch = str.charAt(index);
			if(str.indexOf(ch)==index) {
				for(int innerIndex = 0; innerIndex<str.length(); innerIndex++) {
					if(ch==str.charAt(innerIndex))
						count++;
				}
			}
			if(count>1)
				System.out.println("Duplicate ch - "+ch);
		}
	}
	public static void main(String[] args) {
		getDuplicate("Ashwini Jadhav");
	}

}
