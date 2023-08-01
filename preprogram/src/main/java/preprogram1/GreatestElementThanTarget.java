package preprogram1;

import org.junit.Assert;
import org.junit.Test;

/*
 * input char array
 * output char
 * traverse through the sorted array using for loop
 * if arr[i] > traget , return the arr[i]
 * else return the first letter
 *
 */
public class GreatestElementThanTarget {
	@Test
	public void test1() {
		char actual = TargetGreatest(new char[] {'c','d','j'}, 'a');
		Assert.assertEquals('c', actual);
	}
	
	@Test
	public void test2() {
		char actual = TargetGreatest(new char[] {'c','f','j'}, 'k');
		Assert.assertEquals('c', actual);
	}
	
	
	
	public char TargetGreatest (char[] arr, char n)
	{
		for ( char c: arr)
		{
			if(c > n)
			{
				return c;
			}
		}
		return arr[0];
	}
	
	

}
