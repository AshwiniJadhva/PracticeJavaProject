package practice;

import java.util.HashMap;

public class Test {
	
	 void getCount(int[]arr){
	    for(int index = 0; index<arr.length; index++){
	    	//int max = 0;
	        int count = 0;
	        for(int innerIndex = 0; innerIndex<arr.length; innerIndex++){
	            if(arr[index]==arr[innerIndex]){
					
	            	count++;
	            }
	        }
	        System.out.println("num - "+arr[index]+", count - "+count);
	    }
	    
    }
	
	void getCountUseMap(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int num  : arr) {
			if(map.containsKey(num)) {
				//int count = 0;
				int count = map.get(num)+1;
				map.put(num, count);
			}
			else map.put(num, 1);
		}
		System.out.println(map);
	}

    
    public static void main(String[] args) {
        int[ ] inputs = {3,3,5,8,9,9};
        Test test = new Test();
        //test.getCount(inputs);
        test.getCountUseMap(inputs);
       // System.out.println("Try programiz.pro");
    }

}
