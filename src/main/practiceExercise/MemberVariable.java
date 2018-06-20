package main.practiceExercise;

public class MemberVariable {
	public static void main(String args[]) {
		Member mem = new Member ("Harry Potter",30,2500.4f);
		System.out.println("Member name " + mem.getName());
		System.out.println("Member Age " + mem.getAge());
		System.out.println("Member Salary " + mem.getSalary());
	}
}
