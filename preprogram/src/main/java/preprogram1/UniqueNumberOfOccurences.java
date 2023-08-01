package preprogram1;
/*input int array
 * output boolean
 * create a map to store the frequency of each element
 * check whether freq of any two or more elements are same or not
 * if false return false
 * if freq is unique return true
 * 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberOfOccurences {
	

	@Test
	public void test1() {
	boolean actual = checkUnique(new int[] {1,2,2,1,1,3});
		Assert.assertEquals(true, actual);
	
	public boolean checkUnique(int[] arr)
	{
		int n=arr.length;
		
		HashMap < Integer, Integer > freq = new HashMap<Integer, Integer>();
		
		for (int i = 0; i<n; i++)
		{
			if ( freq.containsKey(arr[i]))
			{
				freq.put(arr[i], freq.get(arr[i])+1);
				
			}else
			{
				freq.put(arr[i], 1);
			}
		}
		
		HashSet<Integer> uniqueFreq = new HashSet<Integer>();
		
		for (Map.Entry<Integer, Integer> i: freq.entrySet())
		{
			if(uniqueFreq.contains(i.getValue())) {
				return false;
				
			}
			else {
				uniqueFreq.add(i.getValue());
				
			}
			return true;
			}
		}
		
		
		return false;
		
		
	}

}
