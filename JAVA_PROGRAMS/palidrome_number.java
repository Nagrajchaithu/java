package JAVA_PROGRAMS;

import java.util.Scanner;

public class palidrome_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int a= sc.nextInt();
		int rev=0;
		int num=a;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(a==rev) {
			System.out.println("polidrome");
		}
		else {
			System.out.println("not a polidrome");
		}

	}

}
