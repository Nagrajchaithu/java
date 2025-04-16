package JAVA_PROGRAMS;

public class Leap_year {

	public static void main(String[] args) {
		int year= 2025;
		boolean leap = true;
		if(year%4 ==0)
		{
			if(year%100 ==0 ) 
			{
				if(year%400 == 0) 
				{
					 leap = true;
				}
				else
					leap = false;
			}
			else
				leap = false;
		}
		else
		{
			leap = false;

		}
		
		if(leap = true)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
		
	}

}
