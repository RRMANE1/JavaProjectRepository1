package controlStatement;

public class Nested_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ATM="SBI";
		String Pass="Sbi@123";
		int Balance=20000;
		
		if(ATM=="SBI")
		{
			System.out.println("You are into correct ATM, Please enter your password");
			if(Pass=="Sbi@123") {
				System.out.println("Correct password, Please choose option");
			}
			else {
				System.out.println("Incorrect password, Please try again");
			}
			if(Balance<=2000) {
				System.out.println("Please wait your transaction is being processed");
			}
			else {
				System.out.println("Insufficient Balance");
			}
			
		}
		else {
			System.out.println("You are in wrong ATM, Please visit your branch");
		}
		

	}

}
