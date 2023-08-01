package preprogram1;
/*
 * input string
 * output boolean
 * if the string contains ba, return false
 * 
 * otherwise  return true
 */

import org.junit.Assert;
import org.junit.Test;

public class AllABeforeB {
	
	@Test
	public void test1() {
	boolean actual = allAB("aabab");
	Assert.assertEquals(false, actual);
	}
	
	
	public boolean allAB(String input)
	{
		if(input.contains("ba"))
		{
			return false;
		}
		return true;
	}

}
