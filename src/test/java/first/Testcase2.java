package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {

	
	@Test(priority=2)
	
	public void test1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	@Test(priority=1)
	public void test2() throws InterruptedException
	{
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
}
