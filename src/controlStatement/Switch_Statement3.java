package controlStatement;

public class Switch_Statement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='E';
		switch(grade)
		{
		case'A':System.out.println("Congratulations, You got 'A' grade");
		break;
		case'B':System.out.println("You got 'B' grade, you can enjoy your party");
		break;
		case'C':System.out.println("You got 'C' grade, Study hard for next time");
		break;
		case'D':System.out.println("You are in only Pass class, prepare yourself and improve your grade");
		break;
		default:System.out.println("Invalid input, please enter grade between 'A' to 'D' only");
		break;
		}

	}

}
