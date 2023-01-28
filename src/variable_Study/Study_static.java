package variable_Study;

public class Study_static {
	
	static int a=45;//static global variable

	public static void main(String[] args) {
		Study_static s=new Study_static();
		System.out.println("Value of a is "+a);
		s.display();
		System.out.println("value of p is "+Study_Static1.p);//calling static global variable form another class
		

		
	}
	public void display() {
		
		int b=32;
		System.out.println("value of b is "+b);//local variable
		System.out.println("value of a is "+a);//static global variable 
	}

}
