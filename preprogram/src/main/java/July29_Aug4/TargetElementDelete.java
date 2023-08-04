package July29_Aug4;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

/*
 * input arr , int
 * output arr
 * convert the list into set
 * traverse trhough the set and delete the target element
 * convert the set into array
 * return the array
 */

public class TargetElementDelete {
	
	@Test
	public void test1() {
	int[] actual = Deletion(new int[] {9,7,3,3,2},3);
	Assert.assertEquals(new int[] {9,7,2}, actual);
	}
	
	
	public int[] Deletion(int[] arr, int x )
	{
		HashSet<Integer> Set = new HashSet();
		
		Set.remove(x);
		
		int n = Set.size();
		int[] arr1 = new int[n];
		
		int i= 0;
		for (int set: Set)
		{
			arr1[i++] = set;
		}
		
		//arr1 = Set.toArray(arr);// -> HashSet,integer> is not applicable to int[]

		return arr1;
	}

}
