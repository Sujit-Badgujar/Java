package if_else;

import java.util.Scanner;

public class aB {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter character");
		char a= sc.next().charAt(0);
		if(a>=65 && a<=90) {
			System.out.println("1");
		}
		else if(a>=97 && a<=122) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}

}
