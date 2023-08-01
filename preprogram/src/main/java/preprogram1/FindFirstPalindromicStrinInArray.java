package preprogram1;

/*Input string array
 * output string
 * declare empty string temp and reverse
 * Traverse through the string array using for loop
 * temp=words[i]
 * traverse through each letter in temp using for loop and decrement to get the reverse of the temp
 * reverse+=words.charAt(i);
 * if reverse equals temp , return temp
 * else temp=""
 * 
 * 
 * 
 *
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class FindFirstPalindromicStrinInArray {
	
	@Test
	public void test1() {
		String actual = findPalidndromfromarray(new String[] {"abc","car","ada","racecar","cool"});
		Assert.assertEquals("ada", actual);
	}
	
	@Test
	public void test2() {
		String actual = findPalidndromfromarray(new String[] {"notapalindrome","racecar"});
		Assert.assertEquals("racecar", actual);
	}
	
	public String findPalidndromfromarray(String[] words) {
		String temp="";
		String reverse="";
		
		for (int i = 0; i < words.length; i++) {
			temp = words[i];   
			for (int  j = temp.length()-1; j >= 0;j--) { 
				reverse=reverse+temp.charAt(j);	
			}
			if(reverse.equals(temp)) {
				return temp;}
			else {
				reverse="";
			}
		}
		return "";
	}

}
