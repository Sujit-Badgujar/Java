package Array;
import java.util.*;
public class SwapAlternate {
	
	private static void TakeInput(int arr[]) {
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
	}
	private static void SwapAlter(int arr[]) {
		for(int i=0; i<arr.length-1;i=i+2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;			
		}		
	}
	private static void display(int[] arr) {
		System.out.println("Swapped Array ->");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		TakeInput(arr);
		SwapAlter(arr);
		display(arr);
	}
	
}
