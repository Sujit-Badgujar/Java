package Patterns;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}