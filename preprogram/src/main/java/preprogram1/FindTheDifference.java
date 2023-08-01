package preprogram1;

/*
 * input - strings
 * out put - int
 * use charAt
 * tsum = tsum + t.charAt(t.length()-1);
 * char ch = (char)(tsum-ssum);
 * return ch;
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class FindTheDifference {
	
	@Test
	public void test1() {
		char actual = findDiff("abcd","abcde");
		Assert.assertEquals('e', actual);
	}
	
	public char findDiff(String s, String t)
	{
		int tsum = 0;
		int ssum= 0;
		
		for(int i=0; i< s.length();i++)
			
		{
			tsum= tsum+t.charAt(i);
			ssum= ssum+s.charAt(i);
		}
		
		tsum = tsum + t.charAt(t.length()-1);
		char ch = (char)(tsum-ssum);
		
		return ch;
		
	}
	
	
	
	

}
