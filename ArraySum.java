
public class ArraySum {

	public static void main(String[] args) {
		int arr[] = {22,20,26,65,7,2,4,6,11,9};
		int sum = 0;

		 for (int j = 0; j < arr.length; j++) {  
	           sum = sum + arr[j];  
	        }  
		System.out.println("The sum values of array is " + sum);
	}

}
