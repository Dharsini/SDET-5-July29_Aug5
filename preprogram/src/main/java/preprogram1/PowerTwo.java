package preprogram1;

import org.junit.Test;
import org.testng.Assert;

/* 
 * input is int
 * output boolean
 * while (n%2==0)
 * {
 * n=n/2
 * }
 * if(n==1)
 * 
 * return true 
 * 
 * return false 
 */

public class PowerTwo {
	
	@Test
	public void test1() {
		boolean actual = twoPowers(27);
		Assert.assertEquals(false , actual);
		
	}
	@Test
	public void test2() {
		boolean actual = twoPowers(16);
		Assert.assertEquals(true , actual);
		
	}
	@Test
	public void test3() {
		boolean actual = twoPowers(1);
		Assert.assertEquals(true , actual);
		
	}
	
	public boolean twoPowers ( int n ) {
		while(n%2==0)
		{
			n=n/2;
			
		}
		
		if(n==1) {
			return true;
			
		}
		return false;
		
	}

}
