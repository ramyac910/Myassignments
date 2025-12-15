package week3.day1;

public class AutoMobileParts {
	
	  // horn ; brake ; clutch; accelerator
	
	public void horn() {
		System.out.println("Horn");
	}
	
	public void brake() {
		System.out.println("brake");
	}
	
	public void clutch() {
		System.out.println("clutch");
	}
	
	public void accelerator() {
		System.out.println("accelerator");
	}
	

	public static void main(String[] args) {

		// Object creation
		
		AutoMobileParts auto = new AutoMobileParts();
		auto.accelerator();
		auto.brake();
		auto.clutch();
		auto.horn();
		
		
	}

}
