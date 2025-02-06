
/*Write a Java program to count capitalised word from String.

Sample Input: GoodMorningTechnoCreditsJun

Sample output: 5*/

package interviewAskedCode;

public class CountCapitalsFromString {
	
	static int getAllCapitalLetters(String str) {
		int count =0;
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch))
				count++;
		}
		return count;
	}
	
	static int getAllCapitalLetters1(String str) {
		int count = 0;
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(ch>= 65 && ch<= 90)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.print("With str method - ");
		int count = getAllCapitalLetters("GoodMorningTechnoCrEditsJunA");
		System.out.println(count);
		
		System.out.print("with ascii value - ");
		int count1 = getAllCapitalLetters1("GoodMorningTechnoCrEditsJunA");
		System.out.println(count1);
	}

}
