package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input int
 * output string
 * 
 * traverse through the loop
 * subtract 1 from n
 * get the current character by doing modulo of n by 26
 * divide n by 26
 * Now reverse the result 
 * return the result.
 * 
 */

public class ExcelColumnNumber {
	
	@Test
	public void test1() {
	String actual = convertNumberToTitle(27);
	Assert.assertEquals("AA", actual);
	}
	
	@Test
	public void test2() {
	String actual = convertNumberToTitle(1);
	Assert.assertEquals("A", actual);
	}
	
	@Test
	public void test3() {
	String actual = convertNumberToTitle(701);
	Assert.assertEquals("ZY", actual);
	}
	
	public static String convertNumberToTitle(int n) 
    {
        StringBuilder ans= new StringBuilder();
        
        while(n>0)
        {
            --n;
            int d= n%26;
            n/=26;
            ans.append((char)('A'+d));            
        }
        
        ans.reverse();
        return ans.toString(); 
    }
    
	
	

}
