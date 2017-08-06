package max_block_of_strings;

public class MaxBlock {

	public static void main(String[] args) {
		System.out.println("Answer should be 2 - " + maxBlock("hoopla"));
		System.out.println("Answer should be 3 - " + maxBlock("abbCCCddBBBxx"));	
		System.out.println("Answer should be 0 - " + maxBlock(""));
		System.out.println("Answer should be 1 - " + maxBlock("xyz"));
		System.out.println("Answer should be 2 - " + maxBlock("xxyz"));	
		System.out.println("Answer should be 2 - " + maxBlock("xyzz"));	
		System.out.println("Answer should be 3 - " + maxBlock("abbbcbbbxbbbx"));	
		System.out.println("Answer should be 3 - " + maxBlock("XXBBBbbxx"));
		System.out.println("Answer should be 4 - " + maxBlock("XXBBBBbbxx"));
		System.out.println("Answer should be 4 - " + maxBlock("XXBBBbbxxXXXX"));
		System.out.println("Answer should be 4 - " + maxBlock("XX2222BBBbbXX2222"));
	}
	public static int maxBlock(String str) {
		int firstMax = 1;
		int secondMax = 1;
		if(str == ""){
			return 0;
		}
		for(int i = 0 ; i < str.length() ; i++){
			for(int j = i+1 ; j < str.length() ; j++){
				if(str.charAt(i) == str.charAt(j)){
					secondMax++;
				}else{
					break;
				}
			}
			if(firstMax>= secondMax){
				secondMax =1;
			}else{
				firstMax = secondMax;
				secondMax = 1;
			}

		}
		return firstMax;
	}
}

//maxBlock("hoopla") → 2
//maxBlock("abbCCCddBBBxx") → 3	
//maxBlock("") → 0	
//maxBlock("xyz") → 1	
//maxBlock("xxyz") → 2		
//maxBlock("xyzz") → 2		
//maxBlock("abbbcbbbxbbbx") → 3	
//maxBlock("XXBBBbbxx") → 3	
//maxBlock("XXBBBBbbxx") → 4
//maxBlock("XXBBBbbxxXXXX") → 4	
//maxBlock("XX2222BBBbbXX2222") → 4

//Given a string, return the length of the largest "block" in the string. 
//A block is a run of adjacent chars that are the same.