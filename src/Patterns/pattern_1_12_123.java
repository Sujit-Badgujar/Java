package Patterns;

import java.util.Scanner;

public class pattern_1_12_123 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Range");
	int n=sc.nextInt();
	int i=1;
	while(i<=n) {
		int j=1;
		while(j<=i) {
			System.out.print(j+" ");
			j+=1;
		}
		System.out.println();
		i+=1;
	}
}
}
