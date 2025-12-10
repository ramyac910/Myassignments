package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Gowthami";
		
		String varName = new String ("Priyanka");
		
		System.out.println("No.Of.Characters in name var is "+name.length());
		
		if (name.equals(varName)) {
			System.out.println("Both the values are equal");
		}else {
			System.out.println("Both the values are not equal");
		}

		// equalignorecase
		
		String refName = "Kaviya";
		String newRefName = "KaViYa";
		
		if (refName.equalsIgnoreCase(newRefName)) {
			System.out.println("Ref Name is equal");
		}else {
			
			System.out.println("Ref Name is not equal");
			
		}
		
		
	}

}
