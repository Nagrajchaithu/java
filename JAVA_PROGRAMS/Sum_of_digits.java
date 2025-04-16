package JAVA_PROGRAMS;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		
   Scanner sc= new Scanner(System.in);
   System.out.println("enter a number");
   int num= sc.nextInt();
   
   int sum=0;
   int rev=0;
   while(num>0) {
	   rev=num%10;
	   sum=sum+rev;
	   num= num/10;
   }
   System.out.println(sum);
   
   
	}

}
