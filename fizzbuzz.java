// Java program to print Fizz Buzz
import java.util.*;
class FizzBuzz
{
	public static void main(String args[])
	{ 
		for (int i=1; i<=100; i++)								 
		{
			//number divisible by 15(divisible by
			// both 3 & 5), print 'FizzBuzz' in
			// place of the number
      
			if (i%15==0)												 
				System.out.print("FizzBuzz"+" "); 
        
			// number divisible by 5, print 'Buzz' 
			// in place of the number
      
			else if (i%5==0)	 
				System.out.print("Buzz"+" "); 

			// number divisible by 3, print 'Fizz' 
			// in place of the number
      
			else if (i%3==0)	 
				System.out.print("Fizz"+" ");
        
				//otherwise print the numbers
			else 
				System.out.print(i+" ");						 
		}
	}
}
