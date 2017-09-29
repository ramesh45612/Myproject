package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import source.Operations;



public class OperationTest {
	
@BeforeClass
public static void bc() throws Exception
{
	System.out.println("before class");
}
	
	

	@Before
	public void before()
	{
		System.out.println("will execute before every test method");
		System.out.println("no of before is equal to no of @test methods");
	}
	
	@After
	public void after()
	{
		System.out.println("will execute after every test method");
		System.out.println("no of after is equal to no of @test methods");

	}

	@Ignore
	//using ignore you can ignore below method to not test
	@Test
	public void testAdd() {
		Operations ob = new Operations();
		assertEquals(4, ob.add(2, 2));
		
	}

	@Test
	public void testDiv() {
		Operations ob = new Operations();
		assertEquals(1, ob.div(2, 2));
		

	}

//	@Test(timeout=1)
	//it won't execute in 1 milli seconds hence it gives timed out exception as Errors
	/*@Test
	//successfully it will execute and comment above @Test(timeout=1)
	public void testTimeout() {
		Operations ob = new Operations();
		assertEquals(12,ob.loop());
	}
*/

	//@Test
	// it won't execute and gives arithmeticexception  as failure (Errors:1 red color)

//@Test(expected=ArithmeticException.class)
//successfull (green) it will be executed and comment above  line @Test means expected as same 
	
	//you can also add like below
	/*@Test(expected=ArithmeticException.class,timeout=100)
	public void testDiv1() {
		Operations ob = new Operations();
		assertEquals(1, ob.div(2, 0));
	}
*/



	

}
