package Patterns;

import java.util.Scanner;

public class p_1_23_456 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		int i=1;
		int val=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(val+" ");
				val+=1;
				j+=1;
			}
			System.out.println();
			i+=1;
		}
	}

}
