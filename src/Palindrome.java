public class Palindrome {
	public static boolean isPalindrome(String word) {
		word = word.toLowerCase();
		int numOfChar = word.length()/2;
		int charMatching = 0;
		for(int i = 0, j = word.length() - 1 ; i < word.length()/2 ; i++, j --){
			
			if(word.charAt(i)==word.charAt(j)){
				charMatching++;
			}

		}
		if (charMatching == numOfChar){
		return true;
		}else{
			return false;
		}
		
	}
}