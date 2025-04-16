package JAVA_PROGRAMS;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int a=num;
		int rev=0;
		while(num>0) 
		{
			
			rev= rev*10+num%10;
			num= num/10;
			
		}
		System.out.println(rev);
				
		
		
}
}