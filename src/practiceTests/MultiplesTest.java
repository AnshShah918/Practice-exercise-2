package practiceTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.practiceExercise.Multiples;

public class MultiplesTest {
	
	@Test
    public void testIsPowerOfFour() {
        Multiples pof = new Multiples();
        boolean expectedValue = true;
        boolean actualValue = pof.isPowerOfFour(256);
        assertEquals(expectedValue, actualValue);
    }
    
    @Test
    public void testIsNotPowerOfFour() {
    	Multiples pof = new Multiples();
        boolean expectedValue = false;
        boolean actualValue = pof.isPowerOfFour(200);
        assertEquals(expectedValue, actualValue);
    }
    
    
    @Test
    public void testCheckForZero() {
    	Multiples pof = new Multiples();
        boolean expectedValue = false;
        boolean actualValue = pof.isPowerOfFour(0);
        assertEquals(expectedValue, actualValue);
    }

}
