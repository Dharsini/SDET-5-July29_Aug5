package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input string
 * output string
 * Traverse through the String characters
 * check if any of character is equal to a,e,i,o,u ,A,E,I,O,U
 * if yes delete the character
 * return the string
 * 
 */

public class StringVowelsRemoval {
	

	@Test
	public void test2() {
	String actual = vowelsRemoving("Testleaf");
	Assert.assertEquals("Tstlf", actual);
	}
	
	public StringBuilder vowelsRemoving(String ip)
	{ 
		
		StringBuilder sb = new StringBuilder(ip);
		for ( int i=0; i<ip.length();i++)
		{
			char ch = ip.charAt(i);
			
			if (! (ch == 'a' || ch =='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='I'||ch=='O'||ch=='U'))
			{
				  sb.append(ip.charAt(i));
				  
			}
		}
		return op;
		
	}

}
