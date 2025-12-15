package week3.day1;

public class car extends AutoMobileParts {
	
	public void designOfCar() {
		System.out.println("DesignNo:abcdefgh12345");
		
	}
	
	
	public static void main(String[] args) {

		AutoMobileParts ambassador = new AutoMobileParts();
		ambassador.accelerator();
		ambassador.brake();
		ambassador.clutch();
		ambassador.horn();
		
		
	}

}
