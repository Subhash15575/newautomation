package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filter {
	
	
	@FindBy(xpath="//a[text()='Mobiles']")
	
	private WebElement  filterbutton;
	

	
	public Filter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void filterbutton()
	{
		filterbutton.click();
	}
	
	
	
	

}
