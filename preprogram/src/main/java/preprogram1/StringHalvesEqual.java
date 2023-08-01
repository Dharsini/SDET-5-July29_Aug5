package preprogram1;
/*
 * inoout string
 * output boolean
 * create a int array of vowels aeiouAEIOU
 * count 1, count 2 = 0
 * iterate from 0 to length/2 and check if charcter of string is eqaul to element in the int vowels array
 * iterate from length/2 to length  and check if charcter of string is eqaul to element in the int vowels array
 * check if the ocunt 1 is count 2
 * return true
 * else return false
 * 
 * 
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class StringHalvesEqual {
	
	@Test
	public void test1() {
		boolean actual = halvesAreAlike("book");
		Assert.assertEquals(true, actual);
	}
	
	public boolean halvesAreAlike(String s) {
	     int[] vowel={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	     int count1=0,count2=0;
	        for(int i=0; i<s.length()/2; i++)
	        {
	            for(int j=0; j<vowel.length; j++)
	            {
	                if(s.charAt(i)==vowel[j])
	                {
	                    count1++;
	                }
	            }
	        }
	        for(int i=s.length()/2; i<s.length(); i++)
	        {
	            for(int j=0; j<vowel.length; j++)
	            {
	                if(s.charAt(i)==vowel[j])
	                {
	                    count2++;
	                }
	            }
	        }
	        if(count1==count2)
	            return true;
	        else
	            return false;
	    }

}
