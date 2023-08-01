package preprogram1;
/*
 * input string
 * output string
 * convert the string into char array
 * traverse through the array using for loop with incrementing 2
 * A[i] += (char) (A[i-1] - '0')
 * 
 * return the string. 
 * 
 */
import org.junit.Assert;
import org.junit.Test;

public class ReplacingDigitsWithChar {
	
	@Test
	public void test1() {
		String actual = replaceDigits("a1c1e1");
		Assert.assertEquals("abcdef", actual);
	}
	
	
	public String replaceDigits(String s ) {
	
	char[] A= s.toCharArray();
	
		for ( int i=1; i<A.length;i+=2)
		{
			A[i] += (char) (A[i-1] - '0');
		}
		return String.valueOf(A);
	}

}
