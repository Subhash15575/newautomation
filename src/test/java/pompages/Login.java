package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
 
	@FindBy(xpath="(//input[@type='email'])[1]")
	private WebElement loginbutton;
	
	public Login(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	public void loginbutton()
	{
		loginbutton.sendKeys("n.subhash2014@gmail.com");
	}
}
