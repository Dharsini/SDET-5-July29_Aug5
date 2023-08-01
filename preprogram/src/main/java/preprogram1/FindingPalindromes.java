package preprogram1;

import org.junit.Assert;
import org.junit.Test;

/*
 * 1. input is int
 * 2.output is int
 * int last digit ; sum=0;a=num;
 * 
 * iterate through for loop untill a>0
 * last digit = num%10;
 * sum=(sum*10) + lastDigit
 * num=num/10
 * 
 * if num is equal =sum 
 * return sum
 * 
 */






public class FindingPalindromes {
	
	@Test
	public void test1( ) {
		
		Assert.assertEquals(757,palindromes(757));
	}
	
	
	
	
	
	
	public int palindromes(int num) {
		
	 int lastDigit ;
	 int sum=0;
	 int a=num;
	 
	 
	while(a> 0) {
		
		lastDigit = num%10;
		sum=(sum*10) + lastDigit;
		num=num/10;
		
		
		
		 
		 
	 }
	
	if (sum==num) {
		
		return sum;
		
	 
	}
		
		
		
		
		
		return 0;
	

}}
