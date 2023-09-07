package July29_Aug4;

/*
 * input string
 * output 
 * 
 * create a boolean array in which each index corresponds to the alphabets from a-z and set to false
 * traverse through the array
 * a-a=0, b-a = 1 ...so on
 * the corresponding element in the boolean array is set to true representing the presence of the letter
 * if any of the element in the boolean array is still false
 * return false
 * 
 *  time complexity 0(n)
 * 
 */

public class CheckIfPangram {
	
	public boolean checkIfPangram(String sentence) {
        boolean[] vis = new boolean[26];
        for (int i = 0; i < sentence.length(); ++i) {
            vis[sentence.charAt(i) - 'a'] = true;
        }
        for (boolean v : vis) {
            if (!v) {
                return false;
            }
        }
        return true;
    }

}

