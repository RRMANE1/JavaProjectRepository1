package controlStatement;

public class Nested_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=70;
		boolean result=true;
		if(marks==70)
		{
			System.out.println("You are selected for Apptitude test");
			if(result==true)
			{
				System.out.println("You are selected for interview");
			}
			else {
				System.out.println("Better luck next time");
			}
		}
		else {
			System.out.println("You are not selected for Apti, try next time");
		}
		

	}

}
