package Array;

import java.util.*;
public class arrayPopulate {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter N :");
	int n=sc.nextInt();
	int arr[]=new int[n];

	int num=1;
	int i=0;
	int j=n-1;
	
	while(i<=j) {
		arr[i]=num;
		num++;
		i++;
	
		if(i<=j) {
			arr[j]=num;
			num++;
			j--;
	}
	}
		for(int k=0; k<n; k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
