package preprogram1;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class INtersectionOfArrays {
	
	@Test
	public void test1() {
		String actual = getUnion(new int[] {6,8,7},3,new int[] {7,9,8},3);
		Assert.assertEquals("6 7 8 9", actual);
	}
	
	static String getUnion(int a[], int n, int b[], int m)
    {
 
        // Defining set container s
        HashSet<Integer> s = new HashSet<>();
 
        // Inserting array elements in s
        for (int i = 0; i < n; i++)
            s.add(a[i]);
 
        for (int i = 0; i < m; i++)
            s.add(b[i]);
        System.out.print(
            "Number of elements after union operation: "
            + s.size() + "\n");
        System.out.print("The union set of both arrays is :"
                         + "\n");
 
        System.out.print(
            s.toString()
            + " ");
		return s.toString(); 
    }
 

}
