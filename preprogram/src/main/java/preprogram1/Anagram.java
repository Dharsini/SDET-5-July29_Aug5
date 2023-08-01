package preprogram1;

/* input strings
 * output boolean
 * if the strings are null , reutrn false
 * if the legth of two strings are not equal , return false
 * int array coount of size 256
 * traverse and increment and decrement the array
 * if the element in count not equal to zero,return true
 * 
 * return false, otherwise.
 * 
 * 
 */

import org.junit.Assert;
import org.junit.Test;



public class Anagram {
	
	
	@Test
	public void test1() {
		boolean actual = anagram_test("book","ookb");
		Assert.assertEquals(true, actual);
	}
	
	public  boolean anagram_test(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else if (str1.length() != str2.length()) {
            return false;
        } else if (str1.length() == 0 && str2.length() == 0) {
            return true;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

}
