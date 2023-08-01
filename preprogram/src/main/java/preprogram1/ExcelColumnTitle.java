package preprogram1;

/*
 * input string
 * ooutput int
 * result = 0
 * traverse through the string 
 *  result *= 26
 *  result += s.charAt(i) - 'A' + 1
 *  
 *  return result
 */

import org.junit.Assert;
import org.junit.Test;

public class ExcelColumnTitle {
	
	@Test
	public void test1() {
	int actual = titleToNumber("AA");
	Assert.assertEquals(27, actual);
	}
	
	
	
	public int titleToNumber(String s)
	{
	    int result = 0;
	    for (int i = 0; i < s.length(); i++)
	    {
	        result *= 26;
	        result += s.charAt(i) - 'A' + 1;
	    }
	    return result;
	}

}
