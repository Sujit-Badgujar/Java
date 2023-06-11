package Array;

public class arrayIncrem {
	
	private static void display(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	private static void increment(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+=1;
		}
	}
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		increment(arr);
		System.out.println("Incremented Array");
		display(arr);
	}
	

	

}
