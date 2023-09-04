package July29_Aug4;
/*
 * input string
 * output boolean
 * 
 * converse the string into char array
 * traverse through the array
 * if the element is R or U, increment the count 
 * if the element is L or D , decrement the count 
 * if the count is 0 , return true
 * else false
 */

import org.junit.Assert;
import org.junit.Test;

public class RobotReturnToOrigin {
	
	@Test
	public void  tests1()
	{
	boolean actual =  Robot("UD");
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void  tests2()
	{
	boolean actual =  Robot("RRDD");
	Assert.assertEquals(false , actual);
	}
	
	@Test
	public void  tests3()
	{
	boolean actual =  Robot("LLUU");
	Assert.assertEquals(false , actual);
	}
	
	@Test
	public void  tests4()
	{
	boolean actual =  Robot("LLL");
	Assert.assertEquals(false , actual);
	}
	
	
	
	
	
	public boolean Robot(String moves)
	{   
		char[] arr = moves.toCharArray();
		int count = 0;
		int count1 =0 ;
		int count2=0;
		
		for ( int i = 0; i < arr.length ; i ++)
		{
			if ( arr[i]== 'R')
			{
				count1++;
			}
			if (arr[i] == 'U')
			{
				count2++;
			}
			if ( arr[i]== 'L')
				{
				count1--;
				}
			if(arr [i]=='D')
			{
				count2--;
			}
			count = count1-count2;
		if ( count == 0)
		{
			return true; 
		}
			
		}
		
		return false;
		
	}

}
