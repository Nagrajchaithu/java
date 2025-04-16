package JAVA_PROGRAMS;

import java.util.Scanner;

public class count_of_digits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num= sc.nextInt();
		int count=0;
		int rev=0;
		
		while(num>0) {
			rev=num%10;
			num= num/10;
			count++;
			
			
		}
		System.out.println(" count of digits"+count);
		

	}

}
