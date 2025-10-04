package scripts;

import org.testng.annotations.Test;

import genericlib.StepGroup;
import pompages.Login;

public class TestCase1 extends StepGroup{
	
	@Test
	
	public void tc1()
	{
		Login l=new Login(driver);
		l.loginbutton();
		
	}

	
}
