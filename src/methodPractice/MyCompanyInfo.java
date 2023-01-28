package methodPractice;

public class MyCompanyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JobInformation(); // call static method from same class
		MyCompanyInfo Infy=new MyCompanyInfo();//create object for call non static method
		Infy.EmployeeInfo(); //call non static method
		
		

	}
	public static void JobInformation() {
		String CompanyName= "Infosys";
		String ProjectName= "Loan Verification";
		String Process="Underwriter";
		float WorkingHours= 9.15f;
		int flower= 3;
		char block= 'A';
		boolean onsite= true;
		
		System.out.println("My Company Name is "+CompanyName);
		System.out.println("My Project name is "+ProjectName);
		System.out.println("I am working in "+Process+" process");
		System.out.println("Our working hours is "+WorkingHours+"hr");
		System.out.println("My team is working on "+flower+"rd flower");
		System.out.println("There are five teams working with us in block "+block);
		System.out.println("I am working in company onsite - "+onsite);
		System.out.println("====================================================================================");
		
		
		}
	public void EmployeeInfo() {
		int teams= 6;
		int maleEmployee= 53;
		int femaleEmployee= 46;
		int securityStaff= 9;
		float totalEmployee= (maleEmployee+femaleEmployee+securityStaff);
		System.out.println("There are "+teams+" teams are working with "+totalEmployee+" Employee");
		System.out.println("=====================================================================================");
	}
	


}
