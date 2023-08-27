package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

public class StringMethods {
	
	
	@Test
	public void test2() {
	String actual = replace("1.1.1.1");
	Assert.assertEquals("1[.]1[.]1[.]1", actual);
	}
	
	public String replace(String ip)
	{  
		String op ="";
		
		String[] split = ip.split("\\.");
		
		
		for ( int i =0; i < split.length;i++)
		{
			if(i!=split.length-1)
			{
				op = op + split[i] + "[.]";
			}
			else {
				op = op + split [i];
			}
		}
				
		return op;
		
	}
}
