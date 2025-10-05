package scripts;

import org.testng.annotations.Test;

import genericlib.StepGroup;
import pompages.Filter;

public class TestCase3 extends StepGroup{
	@Test
	public void tc3()
	{
		Filter f=new Filter(driver);
		
		f.filterbutton();
	}

}
