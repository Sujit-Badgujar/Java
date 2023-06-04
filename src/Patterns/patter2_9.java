package Patterns;

import java.util.Scanner;

public class patter2_9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter:");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1, l=i-1;
			int space=1;
			while(space<=n-i) {
				System.out.print(' ');
				space++;
			}
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			while(l>=1) {
				System.out.print("*");
				l--;
			}	
//			int space1=i;
//			while(space1>=1) {
//				System.out.print(' ');
//				space1--;
//			}
//			while(k>=1) {
//				System.out.print("*");
//				k--;
//			}
//			while(m<=i) {
//				System.out.print("*");
//				m++;
//			}
			System.out.println();
			i++;
		}
		i=n/2;
		while(i>=1) {
			int space =1;
			while(space<=((n/2)-i+1)) {
				System.out.print(' ');
				space++;
			}
			int k=1;
			while(k<=(2*i)-1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i-=1;
		}

	}

}
