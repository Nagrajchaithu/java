package JAVA_PROGRAMS;

public class print_0to_100_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1;i<=100;i++) {
			int count =0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
				if (count==2) {
					System.out.print(i+" ");
				}
				
			}
		}

	
	}

