package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
	driver.findElement(By.className("a-button-text")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Fresh']")).click();
	Thread.sleep(2000);
		

	}

}
