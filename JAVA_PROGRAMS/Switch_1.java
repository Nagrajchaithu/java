package JAVA_PROGRAMS;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
		Switch_1 sw= new Switch_1();
		sw.verify(a);
	}
		public void  verify (int a) {
			switch(a) {
			case 1 :
				System.out.println("mon");
				break;
			case 2:
				System.out.println("Tuseday");
				break;
			case 3:
				System.out.println("wenesday");
				break;
			case 4:
				System.out.println("thur");
				break;
			case 5:
				System.out.println("fri");
				break;
			case 6:
				System.out.println("sat");
				break;
				default:
				System.out.println("enter mon to sat");
			
		}

	}

}
