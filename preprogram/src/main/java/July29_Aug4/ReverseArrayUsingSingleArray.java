package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input char array
 * output char array
 * Traverse throufh the first half of the array
 * swap the first with element with last last element 
 * return the array
 */

public class ReverseArrayUsingSingleArray {
	@Test
	public void test1() {
	char[] actual = ReverseSingleArray(new char[] {'a','b','c','d','e'});
	Assert.assertEquals(new char[] {'e','d','c','b','a'}, actual);
	}
	
	public char[] ReverseSingleArray ( char[] s)
	{
		
		
		
		int i;
		int j;
		char k ;
		for ( i=0; i<s.length/2;i++)
		{
			
			k = s[i];
			s[i] = s [s.length-i-1];
			s [s.length-i-1] = k;
			
		}
		
		for ( j = 0 ; j < s.length ; j++)
		{
			return s ; 
		}
		return s;
		
		
	}
	
	

}
