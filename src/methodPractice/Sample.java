package methodPractice;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kiranaShop();
		Sample helper=new Sample();
		helper.worker();

	}
	public static void kiranaShop() {
		String name="Rushikesh Kirana";
		int Sakhar=100;
		float Jira=115.5f;
		char quality='A';
		boolean Allchecked=true;
		
		System.out.println(name+" Stores purchased ");
		System.out.println("Sakhar - "+Sakhar+"Kg");
		System.out.println("Jira - "+Jira+"Kg");
		System.out.println("Quality of all products - "+quality+"1");
		System.out.println("All products are checked by Store Keeper - "+Allchecked);
		System.out.println("===============================================================");
	}
	public void worker() {
		int worker= 5;
		System.out.println("There are "+worker+" workers working in his Shop");
	}

}
