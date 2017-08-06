package merge_two_string_by_order;

import java.util.Arrays;

public class MergeTwo {

	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[]	sum = new String[a.length+b.length];
		for(int i = 0 ; i < a.length ; i++){
			sum[i] = a[i];
		}
		for(int i = a.length, j = 0 ; i < a.length+b.length ; i++, j++){
			sum[i] = b[j];
		}

		Arrays.sort(sum);
		String[] finalArr = new String[n];
		for(int i = 1, j = 0 ; i < sum.length ; i++){
			if((sum[i] != sum[i-1] || i == sum.length-1) && j < n){
				finalArr[j] = sum[i-1];
				j++;
			}
		}
		return finalArr;
	}

}

//Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
//
//mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
//mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
//mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]