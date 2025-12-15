package week3.day1;

public class Desktopbrowser {
	
	static int browserver = 10;
	static String browsername = "Chrome";
	
	public void openURL()
	{
		System.out.println("URL OPENED");
	}
	
	public void closeBrowser()
	{
		System.out.println("Moved back");
	}
	
	public void navigateBack()
	{
		System.out.println("Navigated back");
	}
	

	public static void main(String[] args) {
		Desktopbrowser run = new Desktopbrowser();
		run.openURL();
		run.closeBrowser();
		run.navigateBack();
		

	}

}
