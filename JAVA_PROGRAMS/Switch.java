package JAVA_PROGRAMS;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr a weekday");
		String sr= sc.next();
		Switch ss = new Switch();
		ss.verify(sr);
		

	}
	public void verify (String sr) {
		
		switch (sr) {
		case "Mon":
			System.out.println("1");
			break;
			
		case "Tuse":
			System.out.println("2");
			break;
			
		case "Wen":
			System.out.println("3");
			break;
			
		case "Thur":
			System.out.println("4");
			break;
			
		case "Fri":
			System.out.println("5");
			break;
			
		case "Sat":
			System.out.println("6");
			break;
			
		case "Sun":
			System.out.println("7");
			break;
			
			
			default :
				System.out.println("enter Mon to Sun");
			
			
			
		}
	}

}
