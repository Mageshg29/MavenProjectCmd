package TestNGBasics;

import org.testng.annotations.Test;

public class TestAnnotation {
	
	@Test  
	public void testA() 
	{
		System.out.println("Stmt-1 from test A()");
		System.out.println("Stmt-2 from test A()");
	}

}
