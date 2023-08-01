package preprogram1;

import org.junit.Assert;
import org.junit.Test;



public class targetdeletion {
	
	@Test
	public void test1() {
		int[] actual = deletionTarget(new int[] {1, 2, 3},3);
		Assert.assertArrayEquals(new int[] {1,2}, actual);
		
	}
	
	static int[] deletionTarget(int arr[], int x)
    {
        
        int i;
        int temp = 0;
        int temp1=0;
        
        for (i=0; i<arr.length; i++)
            if (arr[i] == x)
                break;
  
        
        if (i < arr.length)
        {
             
            
            temp = arr.length - 1;
            temp1 = arr.length;
            temp = temp1;
            for (int j=i; j<temp1; j++)
                arr[j] = arr[j+1];
            
        }
  
        return arr;
    }


}
