package aca;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    {
	
	  @Test
	    public void testConcatenate() {
	        App myUnit = new App();
	        String result = myUnit.concatenate("one", "two");
	        assertEquals("onetwo", result);

	    }
	  
	  @Test
	    public void testConcatenateWithNull() {
	        App myUnit = new App();
	        String result = myUnit.concatenate(null, "two");
	        assertEquals("two", result);

	    }
}
