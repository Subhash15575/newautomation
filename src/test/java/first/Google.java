package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		String ele=driver.findElement(By.xpath("//a[text()='About']")).getText();
		
		String expectedText="About";
		
	if(ele.contains(expectedText))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
		
		WebElement element=driver.findElement(By.name("q"));
		
		if(element.isEnabled())
		{
			System.out.println("field is enable");
		}
		else
		{
			System.out.println("field is disable");
		}
		
		element.sendKeys("Subhash");
		Thread.sleep(2000);
		//element.submit();
		Thread.sleep(2000);
		element.clear();
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		
		Thread.sleep(2000);
	}

}
