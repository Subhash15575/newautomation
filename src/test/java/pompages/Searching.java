package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching {
	@FindBy(id="twotabsearchtextbox")
	private WebElement loginbutton;
	

	@FindBy(id="nav-search-submit-button")
	private WebElement searchbutton;
	
	public Searching(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

}
	public void loginbutton()
	{
		loginbutton.sendKeys("Tablet");
	}
	public void searchbutton()
	{
		searchbutton.click();
	}
}
