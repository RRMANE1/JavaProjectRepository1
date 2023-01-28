package controlStatement;

public class Else_if_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=56;
		if(marks>=66) {
			System.out.println("You are in Distinction");
		}
		else if(marks>=56) {
			System.out.println("You are in First class");
		}
		else if(marks>=35) {
			System.out.println("You are in Pass class");
		}
		else {
			System.out.println("You are fail");
		}
		
		System.out.println("===============================================");
		
		int number=-13;
		
		if(number>0) {
			System.out.println("POSITIVE");
			
		}
		else if(number<0) {
			System.out.println("NEGATIVE");
		}
		else {
			System.out.println("ZERO");
		}

	}

}
