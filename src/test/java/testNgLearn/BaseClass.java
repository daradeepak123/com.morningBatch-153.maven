package testNgLearn;

import org.testng.annotations.Test;

public class BaseClass {
	
	@Test (enabled=false)
	public void performTest3()
	{
		System.out.println("This is testNG method 3");
	}
	
	
	@Test(invocationCount = 10)
	public void performTest()
	{
		System.out.println("This is testNG method");
	}
	
	@Test(description = "general test")
	public void performTest1()
	{
		System.out.println("This is testNG method 1");
	}
	
	@Test
	public void performTest2()
	{
		System.out.println("This is testNG method 2");
	}

	
	
	

}
