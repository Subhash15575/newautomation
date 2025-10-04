package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScripts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		
		
		//WebElement ele = driver.findElement(By.xpath("//a[text()='About Amazon']"));
		WebElement ele =driver.findElement(By.xpath("//a[text()='Amazon Pay on Merchants']"));
		//ele.click();
	
		Point p = ele.getLocation();
		System.out.println(p);
		int x=p.getX();
		int y=p.getY();
		
		System.out.println(x);
		System.out.println(y);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,3000)");
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		
		//ele.click();
		js.executeScript("arguments[0].click();",ele);
		
		Thread.sleep(2000);
		
		driver.close();
	
		
		
		
		
		
	
		
		

	}

}
