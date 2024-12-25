package codingTests.test3;

/*
 * WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr

 */

public class ReturnStringWithoutVowels {
	
	static String getUpdatedString(String str) {
		String updatedStr = "";
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				updatedStr = updatedStr+ch;
			}
		}
		return updatedStr;
	}
	
	public static void main(String[] args) {
		String updatedstr = getUpdatedString("globant india test automation engineer");
		System.out.println(updatedstr);
	}

}
