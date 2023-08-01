package preprogram1;

/*
 * input int
 * output int
 * create a empty arr of size 4
 * i =3
 * while n is not equal o,
 *  arr[i--]=num%10
 * num/=10
 * traverse through the array untill 3, 
 * if arr[i]=6 , then implemet arr[i]=9
 * traverse from last - 3
 * ans = 0 , mul =1
 * ans+=(mul*arr[i]);
 * mul*=10
 * 
 * return ans
            
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class Max69Number {
	
	@Test
	public void test1() {
	int actual = maximum69Number(9669);
	Assert.assertEquals(9969, actual);
	}
	
	
	public static int maximum69Number (int num) 
    {
        int[] arr=new int[4];
        int i=3;
        while(num!=0){
            arr[i--]=num%10;
            num/=10;
        }
        for(i=0;i<=3;i++){
            if(arr[i]==6){
            	arr[i]=9;break;
            	}
        }
        int ans=0,mul=1;
        for(i=3;i>=0;i--){
            ans+=(mul*arr[i]);
            mul*=10;
        }
        return ans;
    }

}
