package preprogram1;

import org.junit.Assert;
import org.junit.Test;

/*
  * inout string and int array
  * output string
  * create a new char array of length same as string 
  * convert the string into char array
  * travers the array using for loop
  * resultArray[indices[i]] = charInWords[i]
  * 
  * return the result array in string. 
  */
public class ShuffleString {
	
	@Test
	public void test1() {
		String actual = restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode", actual);
	}
	
	public String restoreString ( String s , int[] indices) {
		char[] resultArray = new char[s.length()];
		char[] charInWords = s.toCharArray();
		
		for ( int i = 0; i < charInWords.length ; i++)
		{
			resultArray[indices[i]] = charInWords[i];
		}
		return new String(resultArray);
	}

}
