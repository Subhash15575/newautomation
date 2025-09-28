package first;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test(invocationCount=2)
	public void demo1()
	{
		Reporter.log("demo1",true);
	}
	@Test(invocationCount=5)
	public void demo2()
	{
		Reporter.log("demo2",true);
	}

}
