/*

 * This class Calculator can perform addition of multiple numbers, multiplication of multiple numbers

 * and division of two numbers

 */

package EPAM_TASK;

public class TASK_1 {
	public static double add (double a,double b) 
	{
		//return the addition
		return a+b;
		
	}
	public double multiplication(double a,double b)
	{
		//return the multiplication
		return a*b;
	}
	public double substraction(double a,double b)
	{
		//reurn the substraction
		return a-b;
	}
	public double devide(double a,double b)
	{
		//throw the exception when divisor is zero
		if(b==0)
		{
			throw new IllegalArgumentException("can't devide by zero");
		}
		
		else
		{
		//return the division
		return a/b;
		}
	}
	
}
