package preprogram1;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Input is string
 * output is integer
 * convert the given string into char array.
 * int st and rd = -1
 * using for each loop if the character is not a digit continue
 * int n = ch - '0'
  *if (n > st) 
  *rd = st
  *st = n
 *  else if (n > rd && n != st)
  * rd = n
  * return d
  * 
 * 
 */

public class SecondLargestNumber {
	
	@Test
	public void test1() {
		int actual = secondHighest("dfa12321afd");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2() {
		int actual = secondHighest("abc111");
		Assert.assertEquals(-1, actual);
	}
	
	public int secondHighest(String s) {
        char[] chArr = s.toCharArray();
        int st = -1;
        int rd = -1;

        for (char ch : chArr) {
            if (!Character.isDigit(ch)) {
                continue;
            }
            
            int n = ch - '0';
            if (n > st) {
                rd = st;
                st = n;
            } else if (n > rd && n != st) {
                rd = n;
            }
        }
        
        return rd;
    }

}
