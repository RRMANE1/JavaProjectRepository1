package controlStatement;

public class Switch_Statement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String signal="Gray";
				
		switch(signal)
		{
		case"Red":System.out.println("Signal is red, Please stop your bike");
		break;
		case"Yellow":System.out.println("Signal is yellow, Please wait");
		break;
		case"Green":System.out.println("Signal is green, You can go now");
		break;
		default:System.out.println("Please enter valid signal, signals are red,yellow or green only");
		}

	}

}
