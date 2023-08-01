package preprogram1;

/*
 * input int
 * output int
 * traverse through the coin value using for loop
 * coins=coins-1 ( subrtacting the each row from the coins value )
 * if coins < 0 retunr i-1
 * else
 * return 1 
 * 
 * 
 */


import org.junit.Assert;
import org.junit.Test;



public class ArraningCoins {
	
	@Test
	public void test1() {
		int actual = arrangeCoins(5);
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2() {
		int actual = arrangeCoins(8);
		Assert.assertEquals(3, actual);
	}
	
	
	
	
	public int arrangeCoins(int n) {
        int coins = n;
        for(int i=1;i<=n;i++){
            coins=coins-i;
            if(coins<0){
                return i-1;
            }
        }
        
        return 1;
    }

}
