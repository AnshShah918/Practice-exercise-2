package practiceTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.practiceExercise.StudentData;

public class StudentDataTest {
	
	@Test
    public void testMaximumMarks() {
        StudentData sd = new StudentData();
        int marks[]= {-1,22,56,78,10,99,110};
        int expected = 99;
        int actual = sd.maximumMarks(marks);
        assertEquals(expected, actual);
        
    
    }

    @Test
    public void testMinimumMarks() {
        StudentData sd = new StudentData();
        int marks[]= {-1,22,56,78,10,99,110};
        int expected = 10;
        int actual = sd.minimumMarks(marks);
        assertEquals(expected, actual);
        
    }

    @Test
    public void testAvgMarks() {
        StudentData sd = new StudentData();
        int marks[]= {-1,22,56,78,10,99,110};
        float expected = 53.00f;
        float actual = sd.avgMarks(marks);
        assertEquals(expected, actual, 2);
    
    }

}
