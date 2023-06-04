package Patterns;

import java.util.Scanner;

public class traingleNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		int i=1;
		while(i<=n) {
			int p=i;
			int j=1;
			while(j<=i) {
				System.out.print(p);
				p+=1;
				j+=1;
			}
			System.out.println();
			i++;
		}
	}

}
