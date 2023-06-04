package Patterns;

import java.util.Scanner;

public class pattReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=i;
			while(j>=1) {
				System.out.print(j);
				
				j-=1;
			}
			System.out.println();
			i++;
		}
	}

}
