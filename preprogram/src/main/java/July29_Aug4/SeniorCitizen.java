package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input string array
 * output int
 * 
 * test data :
 * ["1313579440F6036","2921522980M6044"]
 * ["7868190130M7522","5303914400F9211","9273338290F4010"]
 * ["1313579440F2036","2921522980M5644"]
 * 
 * Traverse through the string array 
 * select each element and assign to a string 
 * convert the string into charArray
 * traverse through the char array and select 11 , 12 element 
 * concatenate those those elements and that is age
 * convert the age into int
 * if the age is greater than 60 
 * increment the count 
 * 
 */

public class SeniorCitizen {
	
	@Test
	public void  tests1()
	{
	int actual = countOfCitizenAboveSixty (new  String[]  {"7868190130M7522","5303914400F9211","9273338290F4010"});
	Assert.assertEquals(2, actual);
	}
	
	
	
	public int countOfCitizenAboveSixty ( String[] details)
	{
		String S ="";
		char [] arr = {};
		int count = 0 ;
		int ages = 0 ; 
		
		
		for ( int i=0 ; i < details.length ; i++)
		{
			details[i] = S;
			
			
		}
		
		arr= S.toCharArray();
		for ( int j= 0 ; j< arr.length ; j++)
		{
			int age = arr[11]+arr[12];
			 
			
			if ( age > 60)
			{
				count ++;
			}
			
		}
		return count;
		
	}

}
