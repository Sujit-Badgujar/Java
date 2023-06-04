package Array;
import java.util.Scanner;
public class array_Sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Sum=0;
		System.out.println("Enter the size");
		int n =sc.nextInt();
		
		int arr[]=new int[n];
		System.out.print("Enter elements:");
		for (int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
			Sum+=arr[i];
		}
		System.out.println(Sum);
	}

}
