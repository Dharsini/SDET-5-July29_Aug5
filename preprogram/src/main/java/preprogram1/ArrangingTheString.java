package preprogram1;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Input __> integer array and string
 * output --> String
 * string temp =""
 * s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * iterate through codeleet 
 * charAt(indices[i])
 * temp=temp + charAt(indices[i])
 * return temp 
 * 
 *
 * 
 * 
 */





public class ArrangingTheString {
	
	@Test
	public void test2() {
		int[] indices = new int[] {4,5,6,7,0,2,1,3};
		Assert.assertEquals("leetcode" , arrangeTheString((indices) ,"codeleet"));
	}
	
	
	public String arrangeTheString ( int[]arr, String s  ) {
		
		String temp="";
		for (int i = 0; i<s.length()-1;i++) {
			
			temp = temp + s.charAt(arr[i]);
		}
		
		
		return temp;
		
	}

	
	}

}
