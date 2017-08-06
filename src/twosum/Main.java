package twosum;

public class Main {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] indices = twoSum.findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 13);
		System.out.println(indices[0] + " " + indices[1]);
	}
}
