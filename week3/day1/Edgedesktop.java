package week3.day1;

public class Edgedesktop extends Chromedesktop{
	
	static String browsername = "Edge";
	
	public void snapChat()
	{
		System.out.println("Snapchat taken");
	}
	
	public void clearHistory()
	{
		System.out.println("Clear cookies");
	}
	

	public static void main(String[] args) {
         
		Edgedesktop edge = new Edgedesktop();
		edge.snapChat();
		edge.clearHistory();
		edge.closeBrowser();
		edge.openURL();
		edge.navigateBack();
		edge.openIncognito();
		edge.clearCache();
		
		
		
	}

}
