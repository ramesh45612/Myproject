package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunit1 {
   @Test
   public void testAdd() {
      //test data
      int num = 5;
      String temp = null;
      String str = "Junit is working fine";

      //check for equality
      assertEquals("Junit is working fine", str);
      
      //check for false condition
      assertFalse(num > 6);  //green
     // assertTrue(num>6);//red failure 1
     // assertNull(str);    //red failure 1

      //check for not null value
      assertNotNull(str);
   }
}
