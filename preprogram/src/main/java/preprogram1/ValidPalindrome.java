package preprogram1;
/*
 * int l --> start point = 0
 * int h ---> end point = str.length()-1
 * convert tje string into lower case
 * compare the character untill they are equal using while loop
 * using if conditions check if symbol is present in the left and right of the sentence
 * 
 * check if the characters are equal 
 * if not return false ;
 * comes out of the loop , return true.
 * 
 *  
 */

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindrome {
	
	@Test
	public void test2() {
		boolean actual = isValidPalindrome("A man, a plan, a canal: Panama");
		Assert.assertEquals(true, actual);
	}
	
	public boolean isValidPalindrome ( String str)
	{
		int l = 0;
		int h = str.length()-1;
		
		str = str.toLowerCase();
		
		while ( l<=h)
		{
			char getAtl = str.charAt(l);
			char getAth = str.charAt(h);
			
			if ( !(getAtl >= 'a' && getAtl <='z'))
			{
				l++;
			}
			else if (getAth >='a' && getAth <='z')
			{
				
				h--;
			}
			else if(getAtl == getAth){
				l++;
				h--;
				
			}
			else {
				return false;
			}
			
		}
		return true;
	}

}
