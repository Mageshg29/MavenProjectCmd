package TestNGBasics;

import org.testng.annotations.Test;

public class TestAnnotation2 {
	
	@Test  
	public void testA() 
	{
		System.out.println("Stmt-1 from test A()");
		System.out.println("Stmt-2 from test A()");
	}
	
	@Test  
	public void testB() 
	{
		System.out.println("Stmt-1 from test B()");
		System.out.println("Stmt-2 from test B()");
	}

}
