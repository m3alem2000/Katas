package integer_number_has_one;

public class HasOne {

	public static void main(String[] args) {
		HasOne hasOne = new HasOne();
		System.out.println("should be true: " + hasOne.hasOne(10));
		System.out.println("should be false: " + hasOne.hasOne(22));
		System.out.println("should be false: " + hasOne.hasOne(220));
		System.out.println("should be true: " + hasOne.hasOne(212));
		System.out.println("should be true: " + hasOne.hasOne(1));
		System.out.println("should be false: " + hasOne.hasOne(9));
		System.out.println("should be true: " + hasOne.hasOne(211112));
		System.out.println("should be true: " + hasOne.hasOne(121121));
		System.out.println("should be false: " + hasOne.hasOne(222222));
		System.out.println("should be true: " + hasOne.hasOne(121121));
		System.out.println("should be false: " + hasOne.hasOne(2222222));
		
	}

	public boolean hasOne(int n){
		
		while(n / 10 != 0 || (n / 10 == 0 && n % 10 != 0 )){
			if(n / 10 == 1 || n % 10 ==1){
				return true;
			}else{
				n = n / 10;
			}
		}return false;
	}
}

//Given a positive int n, return true if it contains a 1 digit. 
//Note: use % to get the rightmost digit, and / to discard the rightmost digit.

//hasOne(10) → true	true	OK	
//hasOne(22) → false	false	OK	
//hasOne(220) → false	false	OK	
//hasOne(212) → true	true	OK	
//hasOne(1) → true	true	OK	
//hasOne(9) → false	false	OK	
//hasOne(211112) → true	true	OK	
//hasOne(121121) → true	true	OK	
//hasOne(222222) → false	false	OK	
//hasOne(56156) → true	true	OK	
//hasOne(56556) → false	false	OK