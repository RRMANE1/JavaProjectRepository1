package constructor_Study;

public class Practice1 {
	
	int num1;
	int num2;
	int num3;
	
	public Practice1()//user defined constructor without parameter
	{
		num1=12;
		num2=20;
		num3=45;
		
	}
	public Practice1(int a) //user defined constructor with single parameter constructor
	{
		num1=a;
		
	}
	public Practice1(int a,int b)//user defined constructor with two parameter constructor
	{
		num1=a;
		num2=b;
		
	}
	public Practice1(int a, int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
		
	}

	public static void main(String[] args) {
		
		Practice1 P1=new Practice1();//object created with default value zero
		
		P1.addition();

		Practice1 P2=new Practice1(124);
		
		P2.addition();
		
		Practice1 P3=new Practice1(32,35);
		P3.addition();
	}
		
		
		
		
		
		public void addition()//non static method
		{
			int sum=num1+num2;
			
			System.out.println("addition is "+ sum);
	
	}

}
