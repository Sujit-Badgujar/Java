package Patterns;

import java.util.Scanner;

public class pattern2_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter:");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;
			int j=i;
			while(j<=n-i+1) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}


}

