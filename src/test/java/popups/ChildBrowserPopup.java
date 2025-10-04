package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		String id = driver.getWindowHandle();
		System.out.println(id);
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.navigate().to("https://demo.mobiscroll.com/javascript/popup/#");
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		
		System.out.println(ids);
		driver.switchTo().window(id);

	}

}
