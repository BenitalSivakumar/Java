package week1.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester"; 
	String [] a=test.split(" ");
	
		for (int i = 0; i < a.length; i++) {
			if((i % 2)!=0)
			{
				char[] chararr=test.toCharArray();
				for (int j = chararr.length-1; j >=0 ; j--)
					System.out.println(chararr[j]);
													
				

			}
			
		
			
		}
	}
	
	
}
