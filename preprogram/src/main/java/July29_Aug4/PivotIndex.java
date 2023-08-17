package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input arr
 * output int
 * find the sum of the array
 * intialize start = 0
 * traverse the through the array
 * sum = sum - nums[i]
 * if the start and sum are equal 
 * return the i
 * start = start + nums[i]
 * otherwise
 * return -1 
 */

public class PivotIndex 

{
	
	@Test
	public void test1() {
	int actual = pivot(new int[] {1,7,3,6,5,6});
	Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2() {
	int actual = pivot(new int[] {2,-1,1});
	Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test3() {
	int actual = pivot(new int[] {6,7,8});
	Assert.assertEquals(-1, actual);
	}
	
	
	
	
	
	public int pivot ( int[] nums) {
    
    int sum = 0;
    for(int i=0; i < nums.length; i++)
    {
        sum = sum + nums[i];
    }
     
    int start = 0 ;
    for(int i =0; i <nums.length; i ++)
    {
         
        sum = sum - nums[i];
        if(start == sum)
        {
            return i;
        }
        start = start + nums[i];
    }
    return -1;
}
	
	

}
