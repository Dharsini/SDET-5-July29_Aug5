package preprogram1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class DistributingCandies {
	
	/*
	 * 1. n is always even
	 * 2. find the number of distinct elements in an set.
	 * 
	 * 3. find the size of set
	 * 4. compare it with max n/2;
	 * 5.which is the minimum , is the answer
	 * 
	 * 
	 */
	
	
	@Test
	public void test1() {
		int actual = distributeCandies((new int[] {1,1,2,3}));
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2() {
		int actual = distributeCandies((new int[] {1,1,2,2,3,3}));
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3() {
		int actual = distributeCandies((new int[] {6,6,6,6}));
		Assert.assertEquals(2, actual);
	}
	
	
	
	
	
	
	public int distributeCandies(int[] candyType)
	
	{
		Set<Integer> set= new HashSet<>();
		
		
		for (int i: candyType) {
			
			set.add(i);
			
		
		}
		
		return Math.min(candyType.length/2, set.size());
		
		
			
	

}}
