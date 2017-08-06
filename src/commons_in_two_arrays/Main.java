package commons_in_two_arrays;

public class Main {

	public static void main(String[] args) {
		CommonTwo comon = new CommonTwo();
		String[] a = {"a", "a", "b", "b", "c"};
		String[] b = {"a", "b", "b", "b", "c"};
		System.out.println(comon.commonTwo(a, b));

	}
}
//commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
//commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
//commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3