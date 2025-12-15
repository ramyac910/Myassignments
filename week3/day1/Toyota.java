package week3.day1;

public class Toyota extends car{
	
	public void nameOfcar() {
		System.out.println("Innova");
		
	}

	public void logoOfCar() {
		System.out.println("Z");
		
	}
	public static void main(String[] args) {

		Toyota product = new Toyota();
		product.nameOfcar();
		product.logoOfCar();
		product.accelerator();
		product.brake();
		product.clutch();
		product.horn();
		product.designOfCar();
	}

}
