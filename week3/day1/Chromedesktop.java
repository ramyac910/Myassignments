package week3.day1;

public class Chromedesktop extends Desktopbrowser {
	
	public void openIncognito()
	{
		System.out.println("Incognito mode on");
	}
	public void clearCache()
	{
	    System.out.println("Cache clear");
	}
	
	
	public static void main(String[] args) {
		Chromedesktop croma = new Chromedesktop();
		croma.clearCache();
		croma.openIncognito();
		croma.closeBrowser();
		croma.openURL();
		croma.navigateBack();
		
		
	}

}
