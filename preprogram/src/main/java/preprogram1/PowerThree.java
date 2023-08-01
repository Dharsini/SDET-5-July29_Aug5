package preprogram1;

import org.junit.Test;
import org.testng.Assert;

/* 
 * input is int
 * output boolean
 * while (n%3==0)
 * {
 * n=n/3
 * }
 * if(n==1)
 * 
 * return true 
 * 
 * return false 
 */



public class PowerThree {
	
	@Test
	public void test1() {
		boolean actual = ThreePowers(27);
		Assert.assertEquals(true , actual);
		
	}
	
	public boolean ThreePowers ( int n ) {
		while(n%3==0)
		{
			n=n/3;
			
		}
		
		if(n==1) {
			return true;
			
		}
		return false;
		
	}

}
