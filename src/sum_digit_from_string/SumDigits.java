package sum_digit_from_string;

public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits("aa1bc2d3"));

	}

	public static int sumDigits(String str) {
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++){
			if(Character.isDigit(str.charAt(i))) {
				int newInt = Integer.parseInt(""+str.charAt(i));
				if(newInt > 0 && newInt < 10){
					count  = count + newInt;
				}
			} 
		}
		return count;
	}

}

//Given a string, return the sum of the digits 0-9 that appear in the string, 
//ignoring all other characters. Return 0 if there are no digits in the string. 
//(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
//Integer.parseInt(string) converts a string to an int.)
//
//sumDigits("aa1bc2d3") → 6	6	OK	
//sumDigits("aa11b33") → 8	8	OK	
//sumDigits("Chocolate") → 0	0	OK	
//sumDigits("5hoco1a1e") → 7	7	OK	
//sumDigits("123abc123") → 12	12	OK	
//sumDigits("") → 0	0	OK	
//sumDigits("Hello") → 0	0	OK	
//sumDigits("X1z9b2") → 12	12	OK	
//sumDigits("5432a") → 14