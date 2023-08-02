package July29_Aug4;
/*
 * convert the string into char array
 * traverse from right to left
 * if a[i] = 1; 
 * return a[i]
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class LastIndexOfOne {
	
	@Test
	public void test2() {
	int actual = Index("00001");
	Assert.assertEquals(4, actual);
	}
	
	
	
	public int Index(String S)
	{
		

		
		
		char[] newArray = S.toCharArray();
		for (int i = newArray.length-1 ; i >=0 ; i--)
		{
			if(newArray[i]=='1')
			{
				return i;
			}
		}
		return -1;
		
	}

}
