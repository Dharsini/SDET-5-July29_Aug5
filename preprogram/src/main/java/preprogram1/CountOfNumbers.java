package preprogram1;

import org.junit.Test;






public class CountOfNumbers {
	
	public int Findoccurence(int[] nums, int x) {
	int count = 0;
	for (int i=0;i<nums.length;i++) {
		if(nums[i]==x) {
			count++;
}
}
return count;
}

}
