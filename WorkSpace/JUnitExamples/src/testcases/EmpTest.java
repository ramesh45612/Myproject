package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import source.Emp;
import source.Operations;



public class EmpTest {
	
	@Test
	public void testAdd() {
		Emp ob1 = new Emp(10, "Ram", 1500);
		Emp ob2 = new Emp(10, "Ram", 1500);

		assertEquals(true,ob1.equals(ob2));
		
		assertEquals(ob1.hashCode(), ob2.hashCode());
		
		
	}
	
}
