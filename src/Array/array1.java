package Array;

import java.util.Iterator;
import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter a size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements:");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Your array:");
		for(int i : arr) {
		System.out.print(i+" ");
		}
	}

}
