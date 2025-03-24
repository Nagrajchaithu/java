package JAVA_PROGRAMS;

import java.util.Scanner;

public class weekday12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter weekday");
		String ss= sc.next();
		weekday12 wee=new weekday12();
		wee.verify(ss);
		
		

	}
	public void verify(String ss) {
		if(ss.equals("mon")) {
			System.out.println("1");
			
		}
		else if(ss.equals("tus")) {
			System.out.println("2");
			
		}
		else if(ss.equals("wen")) {
			System.out.println("3");
			
		}
		else if(ss.equals("tur")) {
			System.out.println("4");
			
		}
		else if(ss.equals("fri")) {
			System.out.println("5");
			
		}
		else if(ss.equals("sar")) {
			System.out.println("6");
			
		}
		else if(ss.equals("sun")) {
			System.out.println("7");
			
		}
		else {
			System.out.println("enter date  between mon to sun");
		}
		
		
		
		
		
	}

}
