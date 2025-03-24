package Oops;

public class Exeption_Handling {

	public static void main(String[] args) {

		int a=10;
		int b=0;
		System.out.println("My name is hari");
		System.out.println("Course Testing");
		try{
			System.out.println(a/b);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Quality Thought");
		}



	}

}
