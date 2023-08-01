package preprogram1;

/*
 * Input is two strings s and t 
 * output is char
 * traverse through the strings s and t using for loop
 * if s.charAt(i)!=charAt(j)
 * return ch = t. charAt(j)
 * else ch;
 * 
 * 
 */

public class FindTheRandomCharacter {
	
	public char RandhomChar(String s, String t) {
		
		for(int i =0; i < s.length();i++)
		{
			for ( int j=0;j<t.length();j++)
			{
				if (s.charAt(i)!=t.charAt(j))
				{
					return t.charAt(j);
				}
			}
		}
		return 0;
		
	}

}
