package preprogram1;

import org.junit.Assert;
import org.junit.Test;

/*
 * input int
 * output int
 * find the prime number below the number
 * count the number of primes
 * return the count
 * 
 */



public class CountPrimes {
	
	@Test
	public void test1() {
	int actual = PrintPrime(10);
	Assert.assertEquals(4, actual);
	}
	
	public boolean lessThanGivenNumberPrime(int n)
	{
		if(n<=1) {
			return false;
		}
		
		for ( int i=2 ; i < n; i++)
		{
			if(n%1==0) {
				return false;
			}
			
			
		} 
		return true;
		
		
		
		
					
		
	}
	
	public  int PrintPrime(int n)
	{
		
for ( int i=2;i<n;i++) {
			
			if(lessThanGivenNumberPrime(i))
			{
				return i;
			}
		}
		
		return 0;
	}

}
