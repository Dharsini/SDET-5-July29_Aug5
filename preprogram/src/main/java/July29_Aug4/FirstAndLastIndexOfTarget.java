package July29_Aug4;
/*
 * input int arr, int
 * output array
 * 
 * 
 * 
 * test data :
 * 
 *  1. i/p : [0,2,4,6,8]
 *      target : 1
 *      o/p = target is not found
 *      
 * 2. i/p : [7,7,3,4,6]
 *    Target : 7
 *    o/p : 0,1
 *    
 *  3. i/p :[2,3,4,5,6,6]
 *  	target : 6
 *  	o/p : 4,5
 *  
 *  4. i/p:[9,7,3,7,1,7,4]
 *  	target : 7
 *       o/p : 1,5
 *  5. i/p : []
 *  	target : 5
 *  	o/p : target is not found
 *  6. i/p : [9]
 *     target : 9
 *     o/p:0,0
 *     
 *   Pseudocode:
 *   
 *     1. Traverse through the given array
 *     2. if the arr has the target element 
 *     3. check if firstIndex is still -1
 *     4. if yes, change it to corresponding i
 *     5. Whenever arr has the target element , change last index to i
 *     6. return the first index and last index in a result array at the end
 *     
 *     
 *  Time Complexity  : O(n)   
 * 
 * 
 */


public class FirstAndLastIndexOfTarget {
	
	public static void main ( String[] args) {
		
		int[] arr = {0, 0, 0, 1, 1, 1, 2, 2, 3, 4, 5, 5};
		int target = 1; 
	
	int[] result  = firstLast(arr,target);
	
	if(result[0]==-1)
	{
		System.out.println("Target is not found");
		
	}else {
        System.out.println("First Index: " + result[0] + ", Last Index: " + result[1]);
    }
	
	
	
	}
	public static int[] firstLast(int[] arr, int target)
	{
		
		int  firstIndex = -1;
		int lastIndex = -1;
		
		
		for ( int i=0; i < arr.length; i++)
		{
			if(arr[i]==target)
			{
				if (firstIndex==-1)
				{
					firstIndex = i ;
				}
				
				lastIndex = i ;
			}
		}
		int[] result = {firstIndex, lastIndex};
		return result;
		
	}

}
