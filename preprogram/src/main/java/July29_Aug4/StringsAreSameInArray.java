package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input arr
 * output boolean
 * Traverse through the arr word1
 * concatenate the each element ( string )
 *  Traverse through the arr word2
 * concatenate the each element ( string )
 * check the result of word 1 euqal word 2 
 * if yes return true
 */
public class StringsAreSameInArray {
	
	@Test
	public void test1() {
	boolean actual = stringsAreSame(new String[] {"ab","c"},new String[] {"a","bc"} );
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2() {
	boolean actual = stringsAreSame(new String[] {"a","cb"},new String[] {"ab","c"} );
	Assert.assertEquals(false, actual);
	}
	
	
	
	
	
	public boolean stringsAreSame(String[] word1, String[] word2) {
		
		
		
		
		
		
		String Str1="";
		String Str2="";
		String Str3="";
		String Str4="";
		
		for ( int i = 0 ; i<word1.length ; i++)
		{
			Str1 = word1[i];
			Str2 = Str2 + Str1;
			
			
		}
        
		for ( int i = 0 ; i<word2.length ; i++)
		{
			Str3 = word2[i];
			Str4 = Str4 + Str3;
			
			
		}
		
		if(Str2.equals(Str4))
		{
			return true;
			
		}

		
		
		
		
		return false;
		
	}

}
