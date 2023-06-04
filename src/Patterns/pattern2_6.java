package Patterns;

import java.util.Scanner;

public class pattern2_6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter:");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			
			int space=1;
			while(space<=n-i) {
				System.out.print(' ');
				space++;
			}
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			int k=i-1;
			while(k>=1) {
				System.out.print(k);
				k--;
			}
			System.out.println();
			i++;
			}
	}

}
