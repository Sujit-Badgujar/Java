package Array;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index=-1;
		int arr[]= {1, 3, 5, 1, 9};
		System.out.println("Enter the element u want to find :");
		int x= sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				index=i;
				break;
			}
		}
		
		if(index==-1)
			System.out.println(index);
		else
		System.out.println("it is at "+index+" position");
	}

}
