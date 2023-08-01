package preprogram1;

import org.junit.Test;
import org.testng.Assert;

public class NoOfCompleteRows {
	
	@Test
	public void test1() {
		Assert.assertEquals(3, CompleteRows(8));
	}
	public int CompleteRows(int n) {
		int balance=0;
		int count=0;
		for (int i=1;i<=n;i++) {
			
				balance=n-i;
				if(i<balance) {
					count=count+1;
				
			}
		}
			
		return count;
		
	}

}
