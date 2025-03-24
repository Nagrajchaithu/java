package JAVA_PROGRAMS;

import java.util.Scanner;

public class weekday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a nuber");
		int a= sc.nextInt();
		weekday we = new weekday();
		we.verify(a);
	}
	public void verify(int a) {
		
		if (a==1) {
			System.out.println("Monday");
			}
		
		else if (a==2) {
			System.out.println("Tuseday");
			
	                	}
   
		else if (a==3) {
			System.out.println("Wenesday");
		         }
		
		
		else if (a==4) {
			System.out.println("Thurseday");
               }
	

	     else if (a==5) {
		System.out.println("Friday");
              }
		
	  else if (a==6) {
   System.out.println("Satuerday");
           }
		
	else if (a==7) {
		
		System.out.println("Sunday");
	     }
		
		  
	else {
		System.out.println("enter between 1 to 7");
		}
		
		
	}
}
