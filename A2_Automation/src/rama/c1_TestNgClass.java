package rama;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c1_TestNgClass {
	
	@BeforeClass                    // B & C of BeforeClass annotation should be capital
	public void beforeClass()       // b of before class method should be small
	{
		System.out.println("##beforeClass");
	}
    
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("##beforeMethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("###test");
	}
	
	
	
	
	
	
}
