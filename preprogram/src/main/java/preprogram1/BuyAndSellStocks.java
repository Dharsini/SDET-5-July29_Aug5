package preprogram1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * input - int array
 * output - int
 * maxprofit =0
 * traverse through the arr using for 2 for loops
 * Find the difference between next element and before element i.e, prices[j]-prices[i]
 * if diff is greater than maxprofit
 * maxprofit = diff
 * out of the for loop, return maxprofit
 * 
 * 
 * 
 * 
 * 
 */
public class BuyAndSellStocks {
	
	
	@Test
	public void test1() {
		int actual = Stocks(new int[] {7,1,3,5,8,6});
		Assert.assertEquals(7, actual);
	}
	
	@Test
	public void test2() {
		int actual = Stocks(new int[] {7,6,4,3,1});
		Assert.assertEquals(0, actual);
	}
	
	
	
	public int Stocks (int[] prices) {
	
	int l=prices.length;
	  int maxProfit = 0;

	  for(int i=0; i<l-1; i++) {
	    for(int j=i+1; j<l; j++) {
	      int diff = prices[j] - prices[i];
	      if (diff > maxProfit) {
	        maxProfit = diff;
	      }
	    }
	  }
		return maxProfit;
		
	}

}
