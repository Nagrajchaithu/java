package JAVA_PROGRAMS;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a starting number");
		int a= sc.nextInt();
		System.out.println("enter a  ending  number");
		int b= sc.nextInt();
		//int a=7;
		//int count=0;
		for(int i=a;i<=b;i++) 
		{
			int count=0;
			for(int j=1;j<=b;j++) {
				
			
			if(i%j==0) {
				
			count=count+1;
				
			}
			}
			if(count==2) {
				System.out.println(i);
				
			}
//			else {
//				System.out.println("not aprime");
//			}
			
		}

	}

}
