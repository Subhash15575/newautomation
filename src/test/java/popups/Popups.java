package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		driver.get("https://demo.mobiscroll.com/javascript/popup/#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Open popup']")).click();
		//driver.findElement(By.xpath("//button[text()='Try center display mode']")).click();
		Thread.sleep(2000);
		//Alert a= driver.switchTo().alert();
		
		driver.findElement(By.id("demo-popup-close")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
