package first;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement vis = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Mobiles']")));
System.out.println(vis);
          WebElement cli = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mobiles']")));
      w.until(ExpectedConditions.titleContains("Online Shopping site in India"));
          System.out.println(cli);
		String getcurrenturl = driver.getCurrentUrl();
		System.out.println("get current url -"+getcurrenturl);
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getClass());
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		 ele.click();
		 
		// System.out.println(ele.getTagName());
		
		Thread.sleep(2000);
		
		
		
		driver.close();
		

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		System.out.println("passed");
		
	}

}
