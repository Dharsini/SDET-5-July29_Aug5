package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input int
 * output int
 * convert the integer into string
 * convert the string to charv array
 * traverse through the array
 * find the highest digit 
 * assign + sign to it
 * assign alternative sign signs to adjacent digits
 * 
 */

public class AlternatingDigitSum {
	

	@Test
	public void test1() {
	int actual = digitSum(521);
	Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test2() {
	int actual = digitSum(111);
	Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test3() {
	int actual = digitSum(886996);
	Assert.assertEquals(0, actual);
	}
	
	public int digitSum(int n)
	{
		
		String S = Integer.toString(n);
		char[] arr = S.toCharArray();
		
		int sign = 1;
		int ans = 0	;
		int max = arr[0];
		
				
				
		
		for ( int i=0; i < arr.length ; i++)
		{
			int x = arr[i] - '0';
            ans += sign * x;
            sign *= -1;
			
		}
		
		
		
		return ans;
		
	}

}
