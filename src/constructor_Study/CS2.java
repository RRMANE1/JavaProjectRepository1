package constructor_Study;

public class CS2 {
	//example of user defined constructor
	String city="Pune"; //variable declaration manually.
	
	//use of constructor--> to initialize variable
	String name;// variable declaration
	
	public CS2()
	{
		name="Velocity";  //used to initialize variable "name"
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display1();
		CS2 C2=new CS2();
		C2.display();

	}
	public void display()
	{
		System.out.println("I am non static display method");
		System.out.println("My city name is "+city);
		System.out.println("My name is "+name);
	}
	public static void display1()
	{
		System.out.println("I am static display1 method");
	}

}
