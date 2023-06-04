package Patterns;

import java.util.Scanner;

public class starPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		int n = sc.nextInt();
		for(int i=1; i<=n; i+=2) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j+=1;
			}
			System.out.println();
		}
	}

}
