package July29_Aug4;



import org.junit.Assert;
import org.junit.Test;

/*
 * input array of strings
 * output int
 * 
 * Traverse through each string in the array
 * each element of the array is a sentence
 * using split  method, split the string to words using spaces
 * store each word in an string array
 * count of words is the length of words
 * check if the current word count is greater then the maximum
 * if yes assign the word count to max
 * return the max
 * 
 */



public class MaxNumberOfWordsInASentence {
	
	@Test
	public void test1() {
	int actual = MaximumNumberOfWords(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
	Assert.assertEquals(6, actual);
	}
	
	@Test
	public void test2() {
	int actual = MaximumNumberOfWords(new String[] {"please wait", "continue to fight", "continue to win"});
	Assert.assertEquals(3, actual);
	}
	
	
	
	
	public int MaximumNumberOfWords(String[] sentences)
	{
		int max = 0;
		int wordsCount = 0;
		
		for ( int i= 0; i< sentences.length;i++)
		{
			String[] words = sentences[i].split(" ");
			wordsCount = words.length;
			
			if ( wordsCount > max )
			
			{
				max = wordsCount;
			}
			
			
			
		}
		return max;
		
	}
	
	

}

