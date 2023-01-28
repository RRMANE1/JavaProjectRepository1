package controlStatement;

public class Switch_Statement_practice {

	public static void main(String[] args) {
		int day= 3;

		switch(day)
		{case 1:
			System.out.println("today is monday");
		break;
		case 2:
			System.out.println("today is Tusday");
		break;
		
		case 3:
			System.out.println("today is Wednsday");
		break;
		
		case 4:
			System.out.println("today is Thursday");
		break;
		case 5:
			System.out.println("today is Friday");
		break;
		case 6:
			System.out.println("today is Satarday");
		break;
		case 7:
			System.out.println("today is sunday");
		break;
		default:
			System.out.println("Please enter correct day");
		}
	}

}
