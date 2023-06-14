package Searching_Sorting;

import java.util.Scanner;

public class BinarySearchAlgo {

	private static int BinarySearch() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a element to be searched:");
		int tar=sc.nextInt();
		int arr[]= {1, 3, 5, 6, 9, 12};	
		int s=arr[0];
		int e=arr.length-1;
		int mid=0;
		while(s<=e) {
			mid= (s+e)/2;
			if(arr[mid]<tar) {
				s=mid+1;
				//mid= (s+e)/2;
			}
			else if(arr[mid]>tar){
				e=mid-1;
				//mid= (s+e)/2;
			}
			else if(arr[mid]==tar){
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	int target=BinarySearch();
	System.out.println("Target is at "+target+" index.");
	}
}
