package m_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Webdriver_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://worksoft//chromedriver//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://qaclickacademy.com");
		driver.get("http://google.com");
		System.out.println("C o d e  C o m m e n t s");
		
		String title=driver.getTitle();
		//System.out.println();
		//driver.get
		
		System.out.println("Title of page is: "+title);
		//System.out.println(driver.getPageSource());
		System.out.println("URL of page is: "+driver.getCurrentUrl());
		//driver.close();
		
		
		
		driver.manage().window().maximize();
		System.out.println("Maximized browser");
		
		driver.navigate().to("http://yatra.com");
		System.out.println("Navigated to - Title of page is: "+driver.getTitle());
			 //navigate to back
		 driver.navigate().back();
		System.out.println("Back - Title of page is: "+driver.getTitle());
		Thread.sleep(3000);
			 //navigate to forward
		driver.navigate().forward();
		System.out.println("Forward - Title of page is: "+driver.getTitle());
		Thread.sleep(3000);
		//navigate to refresh page
		// driver.navigate().refresh();
		//System.out.println("Page Source : "+driver.getPageSource());
		
		 driver.close();
		 
		System.out.println("E n d  O f  C o d e");


	}

}
