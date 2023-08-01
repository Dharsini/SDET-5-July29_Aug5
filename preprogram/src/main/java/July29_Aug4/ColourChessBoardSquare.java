package July29_Aug4;
/*
 * white - a,c,e,g and even numbers
 * check if coordinates.charAt(0) is a or c or e or g
 * then check if it is %2 =0
 * the return true
 * else false
 *  
 */

import org.junit.Assert;
import org.junit.Test;

public class ColourChessBoardSquare {
	
	@Test
	public void test1() {
	boolean actual = isWhite("a1");
	Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test2() {
	boolean actual = isWhite("h3");
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3() {
	boolean actual = isWhite("c7");
	Assert.assertEquals(false, actual);
	}
	
	
	
	
	public boolean isWhite ( String Coordinates)
	{
		if ( Coordinates.charAt(0)=='a' || Coordinates.charAt(0)== 'c'||Coordinates.charAt(0)=='e'||Coordinates.charAt(0)=='g')
		{
			if ( Coordinates.charAt(1)%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if (Coordinates.charAt(1)%2==0)
		{
			return false;
		}
		else 
		{
			return true;
			
		}
	}

}
