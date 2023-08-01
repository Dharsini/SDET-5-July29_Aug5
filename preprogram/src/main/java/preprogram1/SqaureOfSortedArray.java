package preprogram1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * input is int array --> arr
 * output is int array
 * int temp=0;
 * traverse throught each element in arr using for loop
 * temp =arr[i]*arr[i]
 * arr[i]=temp
 * arr.sort
 * return arr
 * 
 * 
 */





public class SqaureOfSortedArray {
	
	
	@Test
	public void test1() {
		int[] actual = SquareElements(new int[] {-4,-1,0,3,10} );
		Assert.assertArrayEquals(new int[] {0, 1,9,16,100}, actual);
	}
	
	@Test
	public void test2() {
		int[] actual = SquareElements(new int[] {-7,-3,2,3,11} );
		Assert.assertArrayEquals(new int[] {4,9,9,49,121}, actual);
	}
	public int[] SquareElements(int[] arr)
	
	{
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			
			temp=arr[i]*arr[i];
			arr[i]=temp;
			
			
		
		}
		
		Arrays.sort(arr);
			
		return arr;
		
	}
	
	

}
