package Array;

public class arrayFunction {
	private static void displ(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	//private static void incre(int[] input) {
		private static int[] incre(int[] input) {
		input= new int[7];
		for(int i=0; i<input.length; i++) {
			input[i]+=1;
		}
		return input;
	}
		
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5};
		//incre(arr);
		arr=incre(arr);
		
		displ(arr);
		
	}
	

	

}
