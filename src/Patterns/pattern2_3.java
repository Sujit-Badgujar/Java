package Patterns;

import java.util.Scanner;

public class pattern2_3 {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter:");
			int n=sc.nextInt();
			int i=1;
			while(i<=n) {
				int space=1;
				int j=1;
				while(j<=n-i+1) {
					System.out.print("*");
					j++;
				}
//				while(space<=i) {
//					System.out.print(' ');
//					space++;
//				}
				System.out.println();
				i++;
			}
		}

	
	}


