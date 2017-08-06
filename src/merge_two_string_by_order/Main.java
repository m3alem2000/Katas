package merge_two_string_by_order;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		MergeTwo merge = new MergeTwo();
		String[] a = {"a", "b", "c", "z"};
		String[] b = {"a", "c", "z"};

		System.out.println(Arrays.toString(merge.mergeTwo(a, b, 3)));
	}
}

//Expected	Run		
//mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]	["a", "b", "c"]	OK	
//mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]	["a", "c", "f"]	OK	
//mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]	["c", "f", "g"]	OK	
//mergeTwo(["a", "c", "z"], ["a", "c", "z"], 3) → ["a", "c", "z"]	["a", "c", "z"]	OK	
//mergeTwo(["a", "b", "c", "z"], ["a", "c", "z"], 3) → ["a", "b", "c"]	["a", "b", "c"]	OK	
//mergeTwo(["a", "c", "z"], ["a", "b", "c", "z"], 3) → ["a", "b", "c"]	["a", "b", "c"]	OK	
//mergeTwo(["a", "c", "z"], ["a", "c", "z"], 2) → ["a", "c"]	["a", "c"]	OK	
//mergeTwo(["a", "c", "z"], ["a", "c", "y", "z"], 3) → ["a", "c", "y"]	["a", "c", "y"]	OK	
//mergeTwo(["x", "y", "z"], ["a", "b", "z"], 3) → ["a", "b", "x"]	["a", "b", "x"]	OK