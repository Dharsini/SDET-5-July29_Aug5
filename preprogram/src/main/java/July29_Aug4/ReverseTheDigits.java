package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input int 
 * output int
 * convert the number int ostring
 * reverse the string
 * convert the string into int
 */

public class ReverseTheDigits {
	
	@Test
	public void test1() {
	int actual = reverse(157);
	Assert.assertEquals(751, actual);
	}
	
	
	public int reverse(int x ) {
		
	
        char ch ;
        String nStr = null;
		String S = Integer.toString(x);
		
		for ( int i = 0; i <S.length();i++)
		{
			ch=S.charAt(i);
			nStr = ch + nStr;
			x = Integer.parseInt("nStr");
			
			
			
		}
		
		
		return x;
		
	

}}
