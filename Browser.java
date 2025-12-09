package week2.day1;

public class Browser {

	
		// TODO Auto-generated method stub
		
		public String launchBrowser(String browserName) {
			System.out.println(browserName+ " browser launched successfully");
			return browserName;
		
		}
		
		public String loadUrl(String url) {
			System.out.println("Url loaded successfully");
			return url;
		}
		public static void main(String[] args) {
		Browser browserObj = new Browser();
		browserObj.launchBrowser("Chrome Browser");
		browserObj.loadUrl("url");
		}

	


	
}
