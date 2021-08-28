package m_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Chrome statements below:
		//System.setProperty("webdriver.chrome.driver", "C:\\worksoft\\chromedriver\\chromedriver.exe")
		
		System.setProperty("webdriver.chrome.driver","c:\\worksoft\\chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("9845012345");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("21341szag");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//send password -- 
		
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("User name");
		
		
		
		
		//driver.findElement(By.className("gsfi")).sendKeys("class name");
		/*
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Hello");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	*/
		
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Hello");
		/*
		WebElement el=driver.findElement(By.name("q"));
		System.out.println(el);
		*/
		
		//driver.findElement(By.name("q")).sendKeys("name");
		
		//driver.findElement(By.linkText("Images")).click();

		//driver.findElement(By.partialLinkText("Im")).click();
		System.out.println("E n d  O f  C o d e");
		

		
		//Firefox statements below:
		//System.setProperty("webdriver.gecko.driver","c://worksoft//gd//geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://qaclickacademy.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
	

		
	}

}
