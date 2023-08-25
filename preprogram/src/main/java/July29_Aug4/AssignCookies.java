package July29_Aug4;

/*
 * input two arrays
 * output int
 * Sort the given two Arrays
 * intialize the variables i , j , countChildren
 * when the i is lesser than length of g and j is lesser than the length of s
 * 
 * check if element in the s is greater than or equal to the element in g
 * increment contentChildren and i
 * then increment j
 * return the contentChildren. 
 */

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AssignCookies {
	
	@Test
	public void test1() {
	int actual = findContentChildren(new int[] {1, 2,3}, new int[] {1,1});
	Assert.assertEquals(1, actual);
	}
	

	@Test
	public void test2() {
	int actual = findContentChildren(new int[] {1, 2}, new int[] {1,2,3});
	Assert.assertEquals(2, actual);
	}
	
	public int findContentChildren ( int[] g, int[]s)
	{    Arrays.sort(g);
		 Arrays.sort(s);
		 
		 int i = 0;
		 int j= 0;
		 int contentChildren = 0;
		 while(i<g.length && j<s.length)
		 {
			 if(s[j]>=g[i])
			 {
				 contentChildren++;
				 i++;
			 }
			 j++;
		 }
		return contentChildren;
		
	}

}
