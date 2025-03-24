package JAVA_PROGRAMS;

public class everse_string {

	public static void main(String[] args) {
		String s1="well come to java";
		String[] s2= s1.split(" ");
		for(int i=s2.length-1;i>=0;i--) {
			for(int j=s2[i].length()-1;j>=0;j--) {
				System.out.print(s2[i].charAt(j));
				
			}
			//System.out.print(s2[i]+" ");
			
		}

	}

}
