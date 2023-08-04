package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input int 
 * output int 
 * take the modulo of n ,
 * n%10 = x
 * 10-x= y
 * if ( x < y)
 * n= n -x
 * else n= n+y  
 * 
 */

public class RoundTo10 {
	

	@Test
	public void test1() {
	int actual = roundOf(15);
	Assert.assertEquals(10, actual);
	}
	
	@Test
	public void test2() {
	int actual = roundOf(16);
	Assert.assertEquals(20, actual);
	}
	
	@Test
	public void test3() {
	int actual = roundOf(1);
	Assert.assertEquals(10, actual);
	}
	
	
	
	
	
	
	public int roundOf ( int n)
	{ 
		if(n<10)
		{
			int j= 10-n;
			n=n+j;
			return n; 
		}
		
		int x = n%10;
		int y  = 10-x;
		
		
		if (x<=y)
		{
			n=n-x;
		}
		else {
			n=n+y;
		}
		return n;
		
	}

}
