package Array;
import java.util.Scanner;

public class arrayFunctions {
	
	public static void printArr(int[]arr) {
		int a=arr.length;
		for(int i=0; i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		} 
		
	}
	
	public static int[] inputArr() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int n= sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter elements in array:");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]=inputArr();
		printArr(arr);
	}

}
