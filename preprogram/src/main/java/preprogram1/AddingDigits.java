package preprogram1;

import org.junit.Assert;
import org.junit.Test;

public class AddingDigits {

	
	/* Input is int
	 * output is int
	 * convert number into n
	 * int temp =0;
	 * int i=0;
	 * iterate through while loop
	 * add the temp variable with numeric value of array[i];
	 * i++;
	 * if i ==number.length
	 * i=0;
	 * convert the temp into string and tore in num
	 * if lenght of the string value of temp is equal to 1 
	 * n=temp;
	 * return n
	 * 
	 * 
	 * 
	 *
	 * 
	 */
	
	@Test
	public void test1( ) {
		
		Assert.assertEquals(1,addDigits(757));
	}
	
	public static int addDigits(int n){
	    String num = Integer.toString(n);
	    int temp=0;
	    int i=0;
	    while(num.length()>1){
	        temp+=Character.getNumericValue(num.charAt(i));
	        i++;
	        if(i==num.length()){
	            i=0;
	            num=Integer.toString(temp);
	            if(String.valueOf(temp).length()==1){
	                n=temp;
	            }
	            temp=0;
	        }
	    }
	    return n;

	}
}
