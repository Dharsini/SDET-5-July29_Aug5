package July29_Aug4;
/*
 * input int -> 4
 * output int 
 * 1, 1+1, 1+2...1+6 --> 1+2+3+4+6+7
 * then 1+1, (1+1)+1, (1+2)+1,  .....(1+6)+1 
 * -> 2+3+4++5+6+7+8
 * -> 3+4+5+6+7+8+9
 * ->4+5+6+7+8+9+10
 * 
 * result = (1+2+3+4) + (2+3+4+5) .... + (7+8+9+10)
 * rewsult = sum of n numbers + (sum 0f n numbers + n )+ (sum of n numbers + 2n )+....... 
 * + (sum of n numbers + (n-1)n)
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class MoneyBank {
	
	@Test
	public void test1() {
	int actual = Bank(4);
	Assert.assertEquals(10, actual);
	}
	
	
	public int Bank( int n)
	{
		int res=0 ;
		int sum=0;
		int sum1= 0;
		
		for ( int i =1;i<=n;i++)
		{
			sum = sum +i;
			
		}
		
		for ( int j = n ; j<=(n+1);j++)
		{
			sum1= sum1 + j ;
		}
		
		//res = sum + sum + n + sum + 2n + sum + 3n+.......sum+(n+1)n
		
		
		
		
		res = (n*sum) + sum1;
				
		return res;
		
		
	}

}
