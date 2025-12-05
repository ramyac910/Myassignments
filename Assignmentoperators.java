package week1.assignment;

public class Assignmentoperators {

	public static void main(String[] args) {
		
		// Arithmetic operators
		
				int x = 10;
				int y = 3;

				System.out.println(x + y); // Addition
				System.out.println(x - y); // Subtraction
				System.out.println(x * y); // Multiplication
				System.out.println(x / y); // Division
				System.out.println(x % y); // Modulus or Remainder

				int z = 5;
				++z;
				System.out.println(z); // 6
				--z;
				System.out.println(z); // 5
		
		    // Assignment Operators
			 
		    System.out.println(x); //Assignment
		    System.out.println(x += 3); //Add and Assign
		    System.out.println(x -= 2); //Subtract and Assign
		    System.out.println(x *= 4); //Multiply and assign
		    System.out.println(x /=5); //Divide and Assign
		    System.out.println(x %=10); //Modulus and Assign
		    
		    // Comparison Operators
		    
		    System.out.println(x==y); //equal to
		    System.out.println(x!=y); //not equal to
		    System.out.println(x>y);  //greater than
		    System.out.println(x<y);  //less than
		    System.out.println(x<=y); //greater than or equal to
		    System.out.println(x>=y); //less than or equal to
		    	    
		    // Logical Operators
		    
		    System.out.println(x > 3 && x < 12); // Logical and Multiplication
		    // returns true because 10 is greater than 3 AND 10 is less than 12
		    System.out.println(x > 3 || x < 4); // Logical and Addition
		 // returns true because one of the conditions are true ( 10 is greater than 3,
		    //but 10 is not less than 4)
		    System.out.println(!(x > 3 && x < 10)); // Logical Not
		    // Reverse the result, returns false if the result is true
		    
		    // unary operators
		    // Increment
		    
		    ++x;
		    System.out.println(x);
		    
		    // Decrement
		    
		    --x;
		    System.out.println(x);
		    
		    
		    		    
	}

}
