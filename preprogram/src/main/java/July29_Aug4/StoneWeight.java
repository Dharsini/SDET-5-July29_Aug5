package July29_Aug4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
 * inp array
 * out int
 * convert the array into list
 * sort the list
 * assign the last element and element before last element to variables
 * remove the last element from the list
 * again do the same
 * if the last element and other element are not equal , subtract those elemnt and add to the list
 * return the first element of the final list
 * 
 * 
 * 
 * 
 */

public class StoneWeight {
	@Test
	public void test1() {
	int actual = stonesWeight(new int[] {1,1,1});
	Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test2() {
	int actual = stonesWeight(new int[] {2,7,4,1,8,1});
	Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test3() {
	int actual = stonesWeight(new int[] {1});
	Assert.assertEquals(1, actual);
	}
	
	
	
	
	
	
	public int stonesWeight(int[] arr)
	
	{
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(Integer a :arr){  
			list.add(a);  
			}  
		while ( list.size()>1)
		{
			
			Collections.sort(list);
			int firstStone = list.get(list.size()-1);
			int secondStone = list. get(list.size()-2);
			list.remove(list.size()-1);
			list.remove(list.size()-1);
			
			if(firstStone!=secondStone)
			{
				list.add(firstStone-secondStone);
			}
			
			
			
	 
		
		
		
		
		
		
		}
		return list.get(0);
		
		
	}
	
	

}
