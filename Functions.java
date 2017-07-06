/**
 * Functions class contains four methods that are related to each other. 
 * g1 is the model algorithm and g2 is the more efficient version of g1
 * f1 is the model algorithm and f2 is the more efficient version of f1
 * @author Patrick
 *
 */
public class Functions 

{
	/**
	 * The constructor does absolutely nothing.
	 */
	public Functions()
	{
		
	}
	/**
	 * This method will take any number and use an operation until eventually reach 1  by using recursion.
	 * Adding 1 in the return statement counts the method calls.
	 * @param n
	 * @return
	 */
	 public static int g1(int n)
	{
		if(n==1) // base case
		{
			
			return 1;
		}
		else if(n%2 == 0) //if n is even divide by 2 and call method again
		{
			return (1 + g1(n/2));
		}
		else if (n%2 != 2) // if n is odd subtract 1 and call method again with new number
		{
			return (1 + g1(n-1));
		}
		return 0;
	
	}
	/**
	 * Collatz 3n+1 method. Will eventually reduce the input to 1 but is impossible to analyze.
	 * @param n
	 * @return
	 */
	public static int f1(int n)
	{
		if(n==1) // base case
		{
			return 1;
		}
		else if(n%2 == 0) // if n is even call method again with half of n
		{
			return 1 + f1(n/2);
		}
		else				//if n is odd multiply n by 3 then add 1 and call method with new n
		{
			return 1 + f1(3*n + 1);
		}
	}
	/**
	 * This is my more efficient version of g1. It still use recursion, but does more than one calculation
	 * per method call which makes it recur less.
	 * @param n
	 * @return
	 */
	public static int g2(int n)
	{
		if(n==1) // base case
		{
			return 1;
		}
		else if (n%2 == 0) // if n is even divide by 2 until it is not even.
		{
			 while(n%2 == 0)
			 {
				 n = n/2;
			 }
		}
		else
		{
			while(n%2 != 0) //if n is odd subtract 1 until it is not odd
			{
				n--;
			}
		}
		return  1 + g2(n); // call method again with new n.
	}
	/**
	 * This method is the more efficient version of f1
	 * It uses a while loop to do multiple calculations instead of calling the method.
	 * @param n
	 * @return
	 */
	public static int f2(int n)
	{
		if(n == 1) // base case
		{
			return 1;
		}
		else if(n%2 == 0) // if n is even keep dividing n by 2
		{
			while(n%2 == 0)
			{
				n = n/2;
			}
		}
		else // if n is odd multiply n by 3 then add 1
		{
			while(n%2 != 0)
			{
				n = ((3*n)+1);
			}
		}
		return 1 + f2(n); // call method again with new n
	}
	
}
