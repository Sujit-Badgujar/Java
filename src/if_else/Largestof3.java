package if_else;

import java.util.Scanner;

public class Largestof3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter 3 Numbers");
	int a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
	if(a>=b && a>=c) {
		System.out.println(a+" is greater!");
	}else if(b>= a && b>= c){
		System.out.println(b+" is greater!");
	}else {
		System.err.println(c+" is greater!");
	}
}
}
