package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Franme {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Subhash");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Sachin");
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Subhash");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[3]")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//div[@role='option']"));
		//dropdown.click();
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Sachin");
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
