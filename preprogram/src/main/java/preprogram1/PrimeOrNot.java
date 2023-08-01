package preprogram1;
/*
 * check if the number is less than or eqaul to 1 ( 1 is not a prime number )
 * 
 * check from 2 to n-1 ( last number n is that number, 
 * through for lo0p traverse the number 
 * condition for non prime --> n%i==0
 * return false --> not prime number -- > false
 * else return true --> prime number
 */

import org.junit.Assert;
import org.junit.Test;

public class PrimeOrNot {
	
	@Test
	public void test1() {
		boolean actual = primeNumber(28);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test2() {
		boolean actual = primeNumber(37);
		Assert.assertEquals(true, actual);
	}
	
	public boolean primeNumber(int n)
	{
		if (n<=1) {
			return false;
		}
		
		for ( int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true ;
		
	}
	
	

}
