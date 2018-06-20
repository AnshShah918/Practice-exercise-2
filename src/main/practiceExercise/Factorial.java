package main.practiceExercise;

import java.lang.reflect.Array;
/**
 * 
 * @author ansh
 *
 */
public class Factorial {
	/**
	 * <h1>asd
	 * <dd>ssa
	 */
	public void printIntFactorial(){
        int num=1,fact=1;
            while (true)
            {
                System.out.println("The factorial of "+num+" is "+fact);
                if (Integer.MAX_VALUE/(num+1)  < fact) {
                    System.out.println("The factorial of "+(num+1)+" is out of range.");
                    break;
                }
                num++;
                fact *= num;
            }
    }

    public void printLongFactorial(){
        long num=1,fact=1;
            while (true)
            {
                System.out.println("The factorial of "+num+" is "+fact);
                if (Long.MAX_VALUE/(num+1)  < fact) {
                    System.out.println("The factorial of "+(num+1)+" is out of range.");
                    break;
                }
                num++;
                fact *= num;
            }
    }
}
