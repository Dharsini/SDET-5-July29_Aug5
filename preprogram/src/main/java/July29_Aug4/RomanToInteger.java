package July29_Aug4;
/*input string
 * output int
 * Traverse from right to left
 * check if each of the character
 * of the string is I,V,X,L,C,D,M
 * IF 4 * num < ans , subtract num from ans
 * else add them
 * 
 * 
 * 
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class RomanToInteger {
	
	@Test
	public void test1() {
	int actual = romanToInt("III");
	Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2() {
	int actual = romanToInt("IV");
	Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test3() {
	int actual = romanToInt("IX");
	Assert.assertEquals(9, actual);
	}
	
	@Test
	public void test4() {
	int actual = romanToInt("LVIII");
	Assert.assertEquals(58, actual);
	}
	
	
	
	public int romanToInt(String S) {
		
        int ans = 0, num = 0;
        
        for (int i = S.length()-1; i >= 0; i--) {
        	
            switch(S.charAt(i))
            {
                case 'I':
                {
                	num = 1; 
                	break;
                }
                case 'V':{
                	num = 5; 
                	break;
                }

                case 'X': {
                	num = 10; 
                	break;
                }
                case 'L':{
                	num = 50; 
                	break;
                }
                case 'C':{
                	num = 100; 
                	break;
                }
                case 'D':{
                	num = 500;
                	break;
                }
                case 'M': {
                	num = 1000; 
                	break;
                }
            }
            if (4 * num < ans) 
            	{
            	ans -= num;
            	}
            else 
            {
            	ans += num;
            
            	
            }
        }
        return ans;
    }

}
