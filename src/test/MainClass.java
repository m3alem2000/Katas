package test;

class A{
	public int sumNumbers(String str) {
		int finalInt = 0;
		for(int i = 0 ; i < str.length() ; i++){
			if(Character.isDigit(str.charAt(i))){
				finalInt =  finalInt * 10 + Integer.parseInt(""+str.charAt(i));
			}
		}return finalInt;
	}

	public static class MainClass{
		public static void main(String[] args){
			A a = new A();
			System.out.println(a.sumNumbers("adad232dad"));
		}
	}
}