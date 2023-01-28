package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		//I want to print I will I can 5times
		//Start at -->0 ends at -->4 update-->a++
		
		int a=0;//initialization
		while(a<=4)//condition
		{
			//body loop
			System.out.println("I will I can");
			a++;//updation
		}
		System.out.println("==================================");
		//I want to print table of 12
		int b=12;
		while(b<=120){
			System.out.println(b);
			b=b+12;

		}

	}

}
