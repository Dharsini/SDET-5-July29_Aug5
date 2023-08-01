package preprogram1;

import org.junit.Test;

import junit.framework.Assert;

public class examples {

	
	

	
		@Test
		public void test1() {
			boolean actual = isIsogram("stop");
			Assert.assertEquals(true, actual);
		}
		
		@Test
		public void test2() {
			boolean actual = isIsogram("testleaf");
			Assert.assertEquals(false, actual);
		}

		// charAt(), toCharArray
		/*
		 * 1. Convert the string to char array
		 * 2. Traverse through the char array
		 * 3. Compare the first ele with the remaining 
		 * 		by using another for loop
		 * 4. if both char matches
		 * 		--> return false
		 * 	  else if it doesn't match
		 * 		--> continue
		 * 5. Finally return true
		 * 		
		 */
		public boolean isIsogram(String input) {
			char[] charArray = input.toCharArray();
			// testleaf
			for (int i=0; i< charArray.length-1; i++) {
				for(int j=i+1; j<charArray.length; j++) {
					if (charArray[i] == charArray[j]) { 
						return false;
					}
				}
			}
			return true;
		}
		
		
		
	}
		
	


