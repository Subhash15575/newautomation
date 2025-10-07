package first;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriver driver=new ChromeDriver();
	
    driver.manage().window().maximize();
    
    driver.get("https://www.amazon.in/");
    
    Thread.sleep(2000);
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
   
	String title = driver.getTitle();
    //System.out.println(title);
    //Assert.assertEquals(title, "Online Shopping site in India");
   SoftAssert s=new SoftAssert();
    s.assertEquals(title, "Online Shopping site in India");
    System.out.println(title);
    //Reporter.log(title,true);
    //Reporter.log("end of the line",true);
    
    
    
  
	String url = driver.getCurrentUrl();
	

	System.out.println(url);
	
	s.assertAll();
	
	driver.close();
    
    
    
    
    
    
	}
}
