package July29_Aug4;


/*
 * input String

 * output int
 * Traverse through the string
 * Result =26 * result +s[i]-'A'+1
 * return result 
 */
import org.junit.Assert;
import org.junit.Test;

public class ExcelColumnTitle {
	
	@Test
	public void test1() {
	int actual = titleToNumber("AA");
	Assert.assertEquals(27, actual);
	}
	@Test
	public void test2() {
	int actual = titleToNumber("A");
	Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test3() {
	int actual = titleToNumber("AB");
	Assert.assertEquals(28, actual);
	}
	
	@Test
	public void test4() {
	int actual = titleToNumber("ZY");
	Assert.assertEquals(701, actual);
	}
	
	
	
	public int titleToNumber(String s)
	{
	    int result = 0;
	    for (int i = 0; i < s.length(); i++)
	    {
	        result *= 26;
	        result += s.charAt(i) - 'A' + 1;
	    }
	    return result;
	}

}
