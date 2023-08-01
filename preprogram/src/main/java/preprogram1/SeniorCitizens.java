package preprogram1;

/*
 * input string array
 * output int
 * take subtring 11,12
 * age=Integer.parseInt(ageS)
 * if age > 60, increase the count
 * 
 * reutrn count
 * 
 */
import org.junit.Assert;
import org.junit.Test;

public class SeniorCitizens {

	@Test
	public void test1() {
		int actual = findSeniorCitizen(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"});
		Assert.assertEquals(2, actual);
	}
	
	public int findSeniorCitizen(String[] arr)
	{
		String ageS = "";
		int age = 0;
		int count =0;
		
		for (int i=0;i<arr.length;i++)
		{
			ageS=arr[i].substring(11,12);
			age=Integer.parseInt(ageS);
			
			if(age > 60)
			{
				count = count + 1;
			}
			
		}
		return count;
	}

}
