package July29_Aug4;
/*
 * input int -> 4
 * output int 
 * 1, 1+1, 1+2...1+6 --> 1+2+3+4+5+6+7
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
	
	@Test
	public void test2() {
	int actual = Bank(10);
	Assert.assertEquals(37, actual);
	}
	
	
	
	
	public int Bank( int n)
	{
		int count =1;
		int value =1;
		int sum = 0;
		int startValue = 1;
		
		for ( int i = 1; i<=n;i++)
		{
			
			sum = sum + value++; // sum = 0 + 1 ; count = 1		
								// sum = 1+2 -> 3; count =2
								// sum = 3+3 ->6 ; count =3 
			count ++;  
			
			if ( count > 7)
			{
				count = 1;
				startValue++;
				value = startValue;
				
			}
			
			
			
			
			
		}
		return sum;
		
		
	}

}
