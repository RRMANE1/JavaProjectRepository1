package arrayStudy;

public class MultiDimentionalArray {

	public static void main(String[] args) {

		String animal[][]=new String[2][2];
		
		animal[0][0]="Dog";
		animal[0][1]="Cat";
		animal[1][0]="Tiger";
		animal[1][1]="Snake";
		
		System.out.println(animal[0][0]+" ");
		
		System.out.println(animal[0][1]+" ");
		
		System.out.println(animal[1][0]+" ");
		
		System.out.println(animal[1][1]+" ");
		
		System.out.println("===============================");
	
	
	for(int i=0;i<=1;i++) {
		for(int j=0;j<=1;j++) 
		{
			System.out.print(animal[i][j]+" ");
		}
		System.out.println();
	}
	
	String birds[][]=new String[2][2];
	
	animal[0][0]="crow";
	animal[0][1]="Popat";
	animal[1][0]="hen";
	animal[1][1]="Pecock";
	System.out.println(birds);
	}

}
//my comments
//comment 2
