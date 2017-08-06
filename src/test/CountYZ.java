package test;

public class CountYZ {

	public static void main(String[] args) {
		System.out.println(sumNumbers("a123c1"));

	}
	public static int sumNumbers(String str) {
		int sum = 0;
		int finalSum = 0;
		for(int i = 0 ; i < str.length() ; i++){
				if(Character.isDigit(str.charAt(i))){
					sum = sum * 10 + Character.digit(str.charAt(i), 10);
				}else{
					finalSum = finalSum + sum;

			}
				finalSum = sum;
		}
		return sum;
	}
}