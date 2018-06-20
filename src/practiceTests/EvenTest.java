package practiceTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.practiceExercise.EvenNumTest;

public class EvenTest {
	
	int a;
	
	@Test
	public void testMultipleSuccess() {
	//Arrange
	boolean expectedValue = true;
	a = 180;
	
	//Act
	boolean actualValue = EvenNumTest.isEven(a);
	
	//Assert
	
	assertEquals(expectedValue , actualValue);
	
	}
	
	@Test
	public void testMultipleFailure() {
	//Arrange
	boolean expectedValue = false;
	a = 9;	
	//Act
	boolean actualValue = EvenNumTest.isEven(a);
	
	//Assert
	
	assertEquals(expectedValue , actualValue);
	
	}

}
