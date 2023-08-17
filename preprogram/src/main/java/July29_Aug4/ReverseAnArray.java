package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input array
 * output array
 * create an empty array
 * traverse through the given array from right to left
 * traverse through the given array from left to right 
 * assign the value of s[i]=r[j]
 * return r[j]
 */

public class ReverseAnArray {
	
	@Test
	public void test1() {
	char[] actual = reverseArray(new char[] {'a','b','c','d','e'});
	Assert.assertEquals(new char[] {'e','d','c','b','a'}, actual);
	}
	
	public char[] reverseArray ( char[] s)
	{
		char[] r = new char[s.length];
		//int temp;
		int j=0;
		for ( int i = s.length-1 ; i>=0;i--)
			
		{
				
			r[j]=s[i];
			j++;
			
			
		}
		return r;
		
	}

}
