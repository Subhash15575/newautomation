package scripts;

import org.testng.annotations.Test;

import genericlib.StepGroup;
import pompages.Searching;

public class TestCase2 extends StepGroup {
	
	
	@Test
	public void tc2()
	{
		Searching s=new Searching(driver);
		s.loginbutton();
		s.searchbutton();
		
		
	}

}
