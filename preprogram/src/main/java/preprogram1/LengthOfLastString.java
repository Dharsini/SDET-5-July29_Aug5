package preprogram1;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastString {
	
	@Test
	public void test1()
	{
	
	int actual = lengthOfLastWord ("Hello World" );
	Assert.assertEquals(5,actual);
	
	}
	
	public int lengthOfLastWord ( String s) {
		String temp = "";
		s=s.trim();
		for ( int i = s.length()-1;i>=0;i++) {
			if(s.charAt(i)!=' ') {
				temp+=s.charAt(i);
				
				
				
			}else {
				break;
			}
			
	}
		return temp.length();

}}
