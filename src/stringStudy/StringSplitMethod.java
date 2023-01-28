package stringStudy;

public class StringSplitMethod {

	public static void main(String[] args) {

		String s="I LOVE INDIA";
		
		String[] s1=s.split("");
		
		for (int i=0;i<=s1.length-1;i++) {
			System.out.println(s1[i]);
		}
	}

}
