package preprogram1;

import org.junit.Test;

import junit.framework.Assert;

/*
 *     1.Get the both input String values
	   2.Store the String jewels into character array using for loop
	   3.Get the stones input and convert into characters and check with stored character array values
	   4.if the jewels char array values match with the stones char array then increase the count 
	   5.return the count
 */

public class JewelsStones {
	
	
	
	
	@Test
	public void test1() {
		int actual = JewelsAndStones("aA","aAAZZ");
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2() {
		int actual = JewelsAndStones("z","ZZ");
		Assert.assertEquals(0, actual);
	}
	
	public int JewelsAndStones (String jewels,String stones )
	
	{
		int count = 0;
		for (int i = 0; i < jewels.length(); i ++)
		{
			for ( int j=0; j< stones.length(); j++)
			{
				if(jewels.charAt(i)==stones.charAt(j))
				{
					count ++;
				}
			}
		}
		
	
		return count;
		
	}

}
