package preprogram1;

import org.junit.Assert;
import org.junit.Test;

/*
 * input - int array
 * output - int
 * maxcount=0 ,count=0, index=-1
 * find the half length of the arr
 * find the occurence of each element
 * if arr[i]==arr[j]
 * count++
 * if count > maxcount
 * maxcount = count
 * index = i 
 * 
 * if maxcount > n
 * return arr[index]
 * find the greatest occurence and compare with the n/2
 * if it is greater than n/2, return the element. 
 * 
 * public int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;
        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) 
                    count += 1;
            }
            if (count > majorityCount) 
                return num;
        }
        return -1;    
    }
 */


public class FindingTheMajorityElement {
	
	@Test
	public void test1() {
		int actual = majorityElement(new int[] {3,2,3});
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2() {
		int actual = majorityElement(new int[] {2,2,1,1,1,2,2});
		Assert.assertEquals(2, actual);
	}
	public int majorityElement (int[] arr)
	{
		
		int maxcount = 0;
		int index = -1;
		int size=arr.length/2;
		
		for (int i=0;i<arr.length;i++)
			
			
		{
			int count = 0;
			for (int j=0; j<arr.length;j++)
				
			{
				if (arr[i]==arr[j]) {
					count ++;
				}}
			
				if (count>maxcount)
				{
					maxcount=count;
					index = i;
				}
		
				if(maxcount > size)
				{
					
					return arr[index];
				}
		}
		
		
				
			
		
		
		return 0;
		
	}

}
