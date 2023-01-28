package controlStatement;

public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Winter
		//2. Summer
		//3. Rainy
		String Season="Rainy";// key
		
		switch(Season)
		{
		case "Winter":System.out.println("Winter started, Plase wear sweater");
		break;
		case"Summer":System.out.println("This is too hot, Please don't go outside");
		break;
		case"Rainy":System.out.println("Rain started, please wore your Raincoat");
		break;
		default:System.out.println("Out of memory, Please enter Valid season");
		
		}

	}

}
