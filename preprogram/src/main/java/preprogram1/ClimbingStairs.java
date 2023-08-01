package preprogram1;

import org.junit.Test;

import junit.framework.Assert;

/*
 * input - > int 
 * output is int
 * if n is equal to return 1 
 * constant is 1, 2 -- > arr -->Intialize an array 
 * if n is 1 or 2 , the no of ways is n
 * for ( i=3; i <=n;i++)
 * arr[i]=arr[i-1]-arr[i-2]
 * 
 * return arr[n]
 * 
 * 
 * 
 */





public class ClimbingStairs {
	
	@Test
	public void test2() {
		
		Assert.assertEquals(5, ClimbStairs(4));
	}
	
	public int ClimbStairs( int n) {
		
		if(n==1)
		{
			return 1;
		}
		
		int[] arr = new int [n+1];
		arr[1]=1;
		arr[2]=2;
		
		for(int i =3 ; i<=n; i++) {
			arr[i]=arr[i-1] + arr[i-2];
		
		}
		
		
		
		
		
		return arr[n];
		
		
	}

}
