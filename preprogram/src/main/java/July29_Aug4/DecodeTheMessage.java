package July29_Aug4;

/*
 * input string , string
 * output string
 * 
 * Test data:
 * ------------
 * 
Key: "apple"
Message: "ppzzp"
Output: "zzzzz"


Key: "zyxwvutsrqponmlkjihgfedcba"
Message: "abcde fghij"
Output: "zyxwv utsrq"

Key: "abc"
Message: "xyz"
Output: "xyz"

Key: "this is a test"
Message: "tvhd hd b trht"
Output: "this is a test"

Key: "1234567890"
Message: "hello world"
Output: "hello world"

Pseudocode:
-----------

* Create an array of size 26  to store 
* the substitution mapping of letters in the key to the regular English alphabet.
* Traverse  the key  string
* for each character 
* check if the character is a lowercase english letter and 
* the corresponding position in the arr is not filled 
* if yes, fill it with the current letter 
* increment the index
* create an empty string to store the decoded message
* traverse through that string
* for each character
* check if that character is a lowercase english letter 
* if yes append that letter from arr to string
* if the character is a space , append to the string
* return the decodedmessage string. 
* 
* Time Complexity:
* -----------------
* 
* O(n) and O(m) combined
* 
* 

 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class DecodeTheMessage {
	
	@Test
	public void test1() {
	String actual = decode("the quick brown fox jumps over the lazy dog",  "vkbs bs t suepuv");
	Assert.assertEquals("this is a secret", actual);
	}
	
	@Test
	public void test2() {
	String actual = decode("eljuxhpwnyrdgtqkviszcfmabo",  "zwx hnfx lqantp mnoeius ycgk vcnjrdb");
	Assert.assertEquals("the five boxing wizards jump quickly", actual);
	}
	
    public static String decode(String key, String message) {
    	
        char[] substitutionTable = new char[26];
        int index = 0;

        
        for (char c : key.toCharArray()) {
        	
            if (Character.isLowerCase(c) && substitutionTable[c - 'a'] == 0) 
            {
                substitutionTable[c - 'a'] = (char) ('a' + index);
                index++;
            }
        }

        StringBuilder decodedMessage = new StringBuilder();

        
        for (char c : message.toCharArray()) 
        {
            if (Character.isLowerCase(c)) 
            {
                decodedMessage.append(substitutionTable[c - 'a']);
            } else if (c == ' ')
            {
                decodedMessage.append(' ');
            }
        }

        return decodedMessage.toString();
    }

    
}
