package number_divide_itself;

public class DivideSelf {

	public static void main(String[] args) {
		DivideSelf divide = new DivideSelf();
		System.out.println("Answer is true: " + divide.divideSelf(128));
		System.out.println("Answer is true: " + divide.divideSelf(12));
		System.out.println("Answer is false: " + divide.divideSelf(120));
		System.out.println("Answer is true: " + divide.divideSelf(122));
		System.out.println("Answer is false: " + divide.divideSelf(13));
		System.out.println("Answer is false: " + divide.divideSelf(32));
		System.out.println("Answer is true: " + divide.divideSelf(22));
		System.out.println("Answer is false: " + divide.divideSelf(42));
		System.out.println("Answer is true: " + divide.divideSelf(212));
		System.out.println("Answer is false: " + divide.divideSelf(213));
		System.out.println("Answer is true: " + divide.divideSelf(162));
	}

	public boolean divideSelf(int n){
		int num = n;
		while(num % 10 != 0){
			if(num % 10 == 0){
				return false;
			}
			if(n % ( num % 10) != 0){
				return false;
			}else{
				num = num / 10;
			}
		}
		return true;
	}
}
//dividesSelf(128) → true		
//dividesSelf(12) → true		
//dividesSelf(120) → false	
//dividesSelf(122) → true		
//dividesSelf(13) → false	
//dividesSelf(32) → false	
//dividesSelf(22) → true	
//dividesSelf(42) → false
//dividesSelf(212) → true	
//dividesSelf(213) → false
//dividesSelf(162) → true

//We'll say that a positive int divides itself if every digit in 
//the number divides into the number evenly. So for example 128 
//divides itself since 1, 2, and 8 all divide into 128 evenly. 
//We'll say that 0 does not divide into anything evenly, 
//so no number with a 0 digit divides itself. Note: use % to 
//get the rightmost digit, and / to discard the rightmost digit.