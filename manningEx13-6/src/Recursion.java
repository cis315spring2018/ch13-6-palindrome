/**
 *   file: Recursion.java
 */

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class Recursion {

	/**
	 * @param strWord
	 */
	public static boolean isPalindrome(String strWord) {
		// TODO Auto-generated method stub
		
		// palindrome: if for every letter at the beginning
		// there is a matching letter at the end
		
		// end case 1
		if( strWord.length() <= 1 )
			return true;
		
		// compare first and last char
		// if not equal, fail!
		// otherwise keep checking
		
		String c1 = strWord.substring(0, 1);
		String clast = strWord.substring(strWord.length()-1);
		
		// recursion! - check the rest (inner portion)
		if ( 0 == c1.compareTo(clast))
			return isPalindrome( strWord.substring(1,strWord.length()-1));
		else
			return false;
	
	}

	/**
	 * @return
	 */
	public static String strReverse() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
