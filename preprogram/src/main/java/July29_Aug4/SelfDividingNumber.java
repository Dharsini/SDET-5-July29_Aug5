package July29_Aug4;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
 * Create a function to check if the n is self dividing
 * create temp = n
 * traverse through temp 
 * while temp > 0
 * create another variable to store the digits 
 * store the last digit of the n in it.
 * Check if the digit variable !=0 && n % digit == 0 
 * update temp = temp/10
 *  
 * 
 *  
 */



public class SelfDividingNumber {
	
	@Test
	public void test1() {
	List<Integer> actual = selfDividingNumbers(1,22);
	Assert.assertEquals([1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22], actual);
	}
	
	public List<Integer> selfDividingNumbers(int left, int right) {
		
        List<Integer> results = new ArrayList<Integer>();
        
        for (int i = left; i <= right; i++) {
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || i % digit != 0) {
                    break;
                }
                temp = temp/ 10;
            }
            if (temp == 0) {
                results.add(i);
            }
        }
        return results;
    }
	



}
