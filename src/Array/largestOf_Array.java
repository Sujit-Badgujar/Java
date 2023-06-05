package Array;
import java.util.*;

public class largestOf_Array {

	public static int [] takeInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}
	public static int giveLar(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[]=takeInput();
		int Lar= giveLar(arr);
		System.out.println("Largest element is : "+Lar);
	}

}
