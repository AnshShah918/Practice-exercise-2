package practiceTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.practiceExercise.Member;

public class MemberTest {
	
	@Test
    public void testMember() {
         Member mem = new Member("Harry Potter",30,2500.4f);
         assertEquals("Harry Potter", mem.getName()); 
         assertEquals(30, mem.getAge());
         assertEquals(2500.4, mem.getSalary(), 1);
    }

}
