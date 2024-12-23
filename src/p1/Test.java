package p1;

public class Test {
	
	static void getCount(String str, char tagetChar){
		int count = 0;
		String upgratdstr = "";
		for(int index = 0; index<str.length(); index++){
				if(str.charAt(index)==tagetChar)
					count++;
				else
					upgratdstr = upgratdstr + str.charAt(index);
				
		}
		System.out.println(count);
		System.out.println(upgratdstr);
//Assert.assertEquals(expectCount, actualcount);
	}
	
	static int calSpace(String str){
		String temp = "";
		int count =0;
		for(int index = 0; index<str.length(); index++){
					if(str.charAt(index)==' '){
						temp = temp+str.charAt(index);
						
					count = count +Integer.parseInt(temp);
					}
			}
			return count;
		
		}
	
	static void getSpaces(String str){
		String[] temp = str.split(" ");
		
		String spaceCount =" ";
		int count = 0;
		for(int index = 0; index<temp.length; index++){
				if(!Character.isLetter(temp[index].charAt(index))){
						spaceCount =spaceCount+temp[index].charAt(index);
						count = count + Integer.parseInt(spaceCount);
				}					
		}
		System.out.println(count);
}
	
	static void processArrya(int[] arr){
		int[] updatedArr = new int[arr.length];
		for(int index = 0; index<arr.length; index++){
			if(arr[index] != 0){
					updatedArr[index] = arr[index];
			}
				
		}
		for(int index = 0 ; index<arr.length; index++) {
			System.out.print(updatedArr[index]);
		}
	}
	
	public static void main(String[] args) {
		//getCount("testing", 't');
		//int count = calSpace("This is a string");
		//System.out.println(count);
		//getSpaces("This is a tring");
		int arr[] = { 1, 0, 2, 0, 3, 0, 0, 0 };
		processArrya(arr);
	}

}
