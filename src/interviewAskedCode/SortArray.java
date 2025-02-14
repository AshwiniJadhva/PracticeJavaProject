package interviewAskedCode;

public class SortArray {
	
	public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        
        bubbleSortAcending(arr);
        
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSortAcending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if current is greater than next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(arr[j + 1]);
                }
            }
        }
    }

}
