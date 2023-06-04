package if_else;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a No.");
		int n= sc.nextInt();
		int a=2;
		while(a<=n-1) {
			if(n%a==0) {
				System.out.println("Not Prime");
				return;
			}
			a+=1;
		}
		System.out.println("Prime");
	}

}
