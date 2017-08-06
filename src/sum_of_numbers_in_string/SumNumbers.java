package sum_of_numbers_in_string;

public class SumNumbers {

	public int sumNumbers(String str) {
		int finalInt = 0;
		int final1Int = 0;
		int start = 0;
		boolean flag = false;
		for(int i = 0 ; i < str.length() ; i++){
			if(Character.isDigit(str.charAt(i)) || flag){
				if(i==str.length()-1 && !flag){
					finalInt = Integer.parseInt(str.substring(i));
				}
				else if(!flag && i<str.length()){
					start = i;
					flag = true;
				}else{
					if(i > 0 && flag && !Character.isDigit(str.charAt(i))){
						finalInt = Integer.parseInt(str.substring(start, i));
						flag = false;
					}else if(i==str.length()-1){
						finalInt = Integer.parseInt(str.substring(start));
						flag = false;
					}
				}
				final1Int = final1Int + finalInt;
				finalInt=0;
			}
		}return final1Int;
	}

	public static class MainClass{
		public static void main(String[] args){
			SumNumbers sumNumbers = new SumNumbers();
			System.out.println(sumNumbers.sumNumbers("abc123xyz"));
		}
	}
}


//Given a string, return the sum of the numbers appearing in the string, ignoring all other 
//characters. A number is a series of 1 or more digit chars in a row. 
//(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
//Integer.parseInt(string) converts a string to an int.)

//sumNumbers("abc123xyz") → 123	123	OK	
//sumNumbers("aa11b33") → 44	44	OK	
//sumNumbers("7 11") → 18	18	OK	
//sumNumbers("Chocolate") → 0	0	OK	
//sumNumbers("5hoco1a1e") → 7	7	OK	
//sumNumbers("5$$1;;1!!") → 7	7	OK	
//sumNumbers("a1234bb11") → 1245	1245	OK	
//sumNumbers("") → 0	0	OK	
//sumNumbers("a22bbb3") → 25	25	OK