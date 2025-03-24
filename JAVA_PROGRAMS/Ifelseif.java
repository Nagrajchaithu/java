package JAVA_PROGRAMS;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int a= sc.nextInt();
		if(a==1){
			System.out.println("Hari");}
			else if(a>=2 && a<=4) {
				System.out.println("Ram");
			}
			else if (a>=5 && a<=6) {
				System.out.println("kamala");
			
		}
			else if (a>=7 && a<=8) {
				System.out.println("Rani");
			}
			else if (a>=9 && a<=10) {
				System.out.println("janu");
			}
			else {
				System.out.println("God");
			}
		  

	}

}
