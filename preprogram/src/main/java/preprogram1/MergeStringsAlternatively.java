package preprogram1;

import org.junit.Assert;
import org.junit.Test;

/*
 * 1.Get the String input values
	 * 2.Get the length of the given string values
	 * 3.if word1.length ==word2.length
	 * 4.Create a for loop to iterate the values
	 * 5.temp to add the values from charAt Word1(i)+ charAt Word2(i) 
       6.else if word1 < word2 
       7.for loop iterate the values
       8.temp to add the values from charAt Word1(i)+ charAt Word2(i) +  append the remain values of word2
       9.else word1>word2
       10.for loop iterate the values
       11.temp to add the values from charAt Word1(i)+ charAt Word2(i) +  append the remain values of word1
 */

public class MergeStringsAlternatively {
	
	
	@Test
	public void test1() {
		String actual = MergeStrings("abc","pqr");
		Assert.assertEquals("apbqcr", actual);
	}
	
public String MergeStrings(String word1,String word2) {
	String temp="";
	
	if (word1.length()==word2.length()) {
		
		for(int i =0; i < word1.length();i++)
		{
			temp+=word1.charAt(i)+word2.charAt(i);
		}
	} 
	else if(word1.length()>word2.length())
	{
		for (int i = 0; i< word2.length();i++)
		{
			temp+=word1.charAt(i)+word2.charAt(i);
		}
		temp+=word1.substring(word2.length(),word1.length());
	}
	else {
		
		for (int i = 0; i< word1.length();i++)
		{
			temp+=word1.charAt(i)+word2.charAt(i);
		}
		temp+=word2.substring(word1.length(),word2.length());
	  
		
	}
	return temp;
	
	
}

}
