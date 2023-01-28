package controlStatement;

public class NestedIf_Else_practice {

	public static void main(String[] args) {

		String UN="Rohit";
		String PW="123";
		
		if(UN=="Rohit") {
			System.out.println("correct username Please inter PW");
			
			if(PW=="123") {
				System.out.println("correct PW. Login Successful");
			}
			else {
				System.out.println("wrong password,please check");
			}
		}
		else {
			System.out.println("Incorrect UN and PW. unable to login");
		}
	}

}
