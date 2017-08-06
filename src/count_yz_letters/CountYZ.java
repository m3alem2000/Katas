package count_yz_letters;

public class CountYZ {

	public static void main(String[] args) {
		System.out.println(countYZ("fez day"));
		System.out.println(countYZ("fez day"));	
		System.out.println(countYZ("day fez"));	
		System.out.println(countYZ("day fyyyz"));
		System.out.println(countYZ("day yak"));
		System.out.println(countYZ("day:yak"));
		System.out.println(countYZ("!!day--yaz!!"));	
		System.out.println(countYZ("yak zak"));
		System.out.println(countYZ("DAY abc XYZ"));	
		System.out.println(countYZ("aaz yyz my"));	
		System.out.println(countYZ("y2bz"));
		System.out.println(countYZ("zxyx"));
	}

	public static int countYZ(String str) {
		int count = 0;
		for(int i = 1 ; i < str.length() ; i++){
			if(!Character.isLetter(str.charAt(i))){
				if(str.toLowerCase().charAt(i-1) == 'y' || str.toLowerCase().charAt(i-1) == 'z'){
					count++;
				}
			}
		}
		if(str.toLowerCase().charAt(str.length()-1)== 'y' || str.toLowerCase().charAt(str.length()-1)== 'z'){
			count++;
		}
		return count;
	}
}



//Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
//
//countYZ("fez day") → 2	
//countYZ("day fez") → 2		
//countYZ("day fyyyz") → 2	
//countYZ("day yak") → 1
//countYZ("day:yak") → 1
//countYZ("!!day--yaz!!") → 2	
//countYZ("yak zak") → 0	
//countYZ("DAY abc XYZ") → 2	
//countYZ("aaz yyz my") → 3	
//countYZ("y2bz") → 2	
//countYZ("zxyx") → 0