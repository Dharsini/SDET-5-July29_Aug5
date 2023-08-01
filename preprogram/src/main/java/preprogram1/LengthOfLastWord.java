package preprogram1;



import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWord {
	
	@Test
	public void test1() {
	int actual = LastWord("Hello World");
	Assert.assertEquals(5, actual);
	}
	
	
	public int LastWord(String s)
	{
		s=s.trim();
		String temp ="";
		
		for (int i = s.length()-1;i>=0;i++)
		{
			if(s.charAt(i)!= ' ')
			{
				temp+= s.charAt(i);
				
			}else
			{
				break;
			}
		}
		
		return temp.length();
		
		
	}

}
