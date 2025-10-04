package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		
		//a.accept();
		a.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		a.sendKeys("Subhash");
		Thread.sleep(2000);
		a.accept();
		
		
		//driver.close();
	}

}
