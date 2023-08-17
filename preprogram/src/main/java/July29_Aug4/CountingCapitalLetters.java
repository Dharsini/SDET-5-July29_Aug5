package July29_Aug4;
/*
 * Input string
 * output int 
 * count =0
 * Convert the String to charArray
 * Traverse through each char and check for ascii value from 65 to 90
 * increase the count
 * return the count
 */

import org.junit.Assert;
import org.junit.Test;

public class CountingCapitalLetters {
	@Test
	public void test1() {
	int actual = countOfCapitals("ILoveIndia");
	Assert.assertEquals(3, actual);
	}
	
	public int countOfCapitals(String s)
	{
		
		int count = 0;
		
		char[] ch = s.toCharArray();
		
		for (int i=0; i< ch.length; i++)
		{
			if ( ch[i]>=65 && ch[i] <=90)
			{
				count++;
			}
		}
		return count;
		
	}
	
	
	

}
