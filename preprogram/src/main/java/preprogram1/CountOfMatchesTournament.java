package preprogram1;

import org.junit.Assert;
import org.junit.Test;

/*1.Get the input value
2.while(n>1){ 
if(n%2==0)
n=n/2
matches = matches+n;
else{
    matches=(n-1/2);
    n=matches+1;
    
   }return matches
* }
*/

public class CountOfMatchesTournament {
	
	@Test
	public void test1() {
		int actual = numberOfMatches(14);
		Assert.assertEquals(13, actual);
	}
	
	public int numberOfMatches(int n) {
		int m=0;
		while(n>1)
		{
			m = m + n/2;
					n = (n+1)/2;
		}
		return m;
	}

}
