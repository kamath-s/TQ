package m_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_FF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Firefox statements below:
		System.setProperty("webdriver.gecko.driver","c://worksoft//gd//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://qaclickacademy.com");
		System.out.println("C o d e  C o m m e n t s");
		System.out.println("Title of page is: "+driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println("URL of page is: "+driver.getCurrentUrl());
		//driver.close();
			
		System.out.println("E n d  O f  C o d e");
	
	}

}
