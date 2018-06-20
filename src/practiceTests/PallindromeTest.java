package practiceTests;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import main.practiceExercise.Pallindrome;

public class PallindromeTest {
	
		String str;
		
		@Test
		public void testPallindromeSuccess() {
		//Arrange
		String expectedValue = "Pallindrome";
		str = "abcba";
		Pallindrome obj = new Pallindrome();
		
		//Act
		String actualValue = obj.reverseString(str);
		
		//Assert
		
		assertEquals(expectedValue , actualValue);
		
		}
		
		@Test
		public void testPallindromeFailure() {
		//Arrange
		String expectedValue = "Not";
		str = "abad";
		Pallindrome obj = new Pallindrome();
		
		//Act
		String actualValue = obj.reverseString(str);
		
		//Assert
		
		assertEquals(expectedValue , actualValue);
		
		}
		
		@Test
		public void testPallindromeInvalid() {
		//Arrange
		String expectedValue = "Invalid Input";
		str = "";
		Pallindrome obj = new Pallindrome();
		
		//Act
		String actualValue = obj.reverseString(str);
		
		//Assert
		
		assertEquals(expectedValue , actualValue);
		
		}
		
		@Test
		public void testPallindromeSingle() {
		//Arrange
		
		str = "a";
		String expectedValue = str;
		Pallindrome obj = new Pallindrome();
		
		//Act
		String actualValue = obj.reverseString(str);
		
		//Assert
		
		assertEquals(expectedValue , actualValue);
		
		}
}
