package July29_Aug4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

	public class SecondLargestNumber {
		
		@Test
		public void test2() {
		int actual = SecondLargestNumberImproved(new int[] {100,90,80,450,100,90,100,400});
		Assert.assertEquals(400, actual);
		}

		public int SecondLargestNumberImproved(int[] arr) {
			
			
			int temp1 = arr[0];
			int temp2 = arr[0];
			
			for (int i = 1; i < arr.length; i++) {
				if (temp1<arr[i]) {
					temp2=temp1;
					temp1=arr[i];
				}
				else if(arr[i]>temp2) {
					temp2 = arr[i];
					}
				}
			return temp2;
		}

	}


