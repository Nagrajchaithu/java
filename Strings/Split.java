package Strings;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1="well come to java";
     String s2="WELL COME TO JAVA";
     String []aa=s2.split(" ");
     for(int i=0;i<=aa.length-1;i++) {
     System.out.print(aa[i]+" ");  
    		 
     
	}
     System.out.println();
     System.out.println(s1.equalsIgnoreCase(s2));

}
}  