package JAVA_PROGRAMS;

public class Vowels_consonants {

	public static void main(String[] args) {
		String s1="java developer";
		int vowels=0;
		int consonants=0;
		
		
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
				vowels++;
				
				
			}
			else 
			{
				consonants++;
			}
			
		}
		System.out.println(vowels);
		System.out.println(consonants);

	}

}
