package week2.day4;

public class JavaString {

	public static void main(String[] args) {

		String str1 = "java programming";
		
		for (int i=0; i < str1.length(); i++)
		{
			char charIndex = str1.charAt(i);
			
			if (charIndex == ' ') {
				
				System.out.println(i+ " Space");
			}else if(charIndex == 'a') {
				 
				System.out.println(i + " "+charIndex);
				
			}
		}
		
		
	}

}
