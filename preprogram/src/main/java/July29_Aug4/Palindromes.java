package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input number
 * output boolean
 * a=num
 * sum=0
 * last digit = 0
 * while a is greater 0 
 * take the modulus of the given number and it is the last digit
 * sum is derived multiplying sum with 10 and adding it with last digit
 * the num will be num divided by 10
 * if the sum is equal to num
 * return true
 * else false
 * 
 */

public class Palindromes {
	
	@Test
	public void test1() {
	boolean actual = palindromeNumber(121);
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2() {
	boolean actual = palindromeNumber(10);
	Assert.assertEquals(false, actual);
	}
	
	
	
	
	public boolean palindromeNumber(int a)
	{
		
		int lastdigit, sum = 0;
		int num = a;
		
		
		while (a>0)
		{
			lastdigit = num % 10;
			sum = (sum*10) + lastdigit;
			num = num / 10;
		}
		
		if(sum==num)
		{
			return true;
		}
		
		
		return false;
		
	}

}
