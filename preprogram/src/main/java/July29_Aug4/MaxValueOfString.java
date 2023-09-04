package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * Input array
 * output int 
 * 
 * Traverse through the array strs
 * check if each element (string) contains alphanumeric or alphabets or digits only
 * if the string contains alphanumeric or alphabets , store the lenght of the string in variables
 * if the string contains only digit, store the numeric value of the string.
 * return the highest stored variables
 */

public class MaxValueOfString {
	@Test
	public void test1() {
		int actual = Maximum(new String[] {"alic3","bob","3","4","00000"});
		Assert.assertEquals(5, actual);
	}
	
	public int Maximum(String[] strs)
	
	{
		int count1 = 0;
		int count2 = 0;
		int count3 =0;
		int first =0; 
		int biggest = 0;
		for ( int i = 0; i < strs.length ; i++)
		{
			boolean alphaNumeric = strs[i].matches("[a-zA-Z0-9]");
			System.out.println(alphaNumeric);
			boolean alphabets = strs[i].matches("[a-zA-Z]");
			boolean digits = strs[i].matches("[0-9]");
			
			if(alphaNumeric)
			{
				count1 = strs[i].length();
				System.out.println(count1);
				
			}
			if(alphabets)
			{
				 count2 = strs[i].length();
				 System.out.println(count2);
			}
			
			if(digits)
			{
				 count3=Integer.parseInt(strs[i]);
				 System.out.println(count3);
			}
			
			
		
		
		
	}
		
		if ( count1 > count2)
			
			
		{
			first = count1;
			
					
		}
		else {
			first = count2;
		}
		if ( first > count3)
		{
			biggest = first;
			
			
		}
		else {
			biggest= count3;
			
		}
		return biggest;

}
}

