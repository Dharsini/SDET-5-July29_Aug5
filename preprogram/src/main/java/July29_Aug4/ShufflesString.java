package July29_Aug4;

/*
 * input string and int array
 * output String
 * create a new result array with size of string length
 * convert the string into charArray
 * Traverse through the char Array
 * assign  each character of string to the result array with index of indices[i]
 * return the string value of the result array. 
 */

import org.junit.Assert;
import org.junit.Test;

public class ShufflesString {
	
	@Test
	public void test1() {
		String actual = stringShuffle("codeleet", new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode", actual);
		
		}
	
	@Test
	public void test2() {
		String actual = stringShuffle("abc", new int[] {0,1,2});
		Assert.assertEquals("abc", actual);
		
		}
	
	public String stringShuffle ( String s , int[] indices) {
		
		char[] resultArray = new char[s.length()];
		char[] charWords = s.toCharArray();
		
		for ( int i = 0; i < charWords.length ; i++)
		{
			resultArray[indices[i]] = charWords[i];
		}
		return new String(resultArray);
	}


}
