package first;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\chaardo\\eclipse-workspace\\Automation\\properties");
		
		p.load(fis);
		
		
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(p.getProperty("URL"));
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
