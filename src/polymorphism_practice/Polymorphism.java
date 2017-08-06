package polymorphism_practice;

import java.util.Arrays;

public class Polymorphism {

	public static void main(String[] args) {
		int[] a = {12, 10, 4};
		int[] b = {2, 20, 30}; 
			  Arrays.sort(a);
			  Arrays.sort(b);
			  int num1 = 0;
			  int num2 = 0;
			  String ads = "ad ads";
			  ads.;
			  ads.charAt(ads.length());
			  for(int i = a.length-1 ; i >= 0 ; i--){
			    if(a[i] % 10 == 0){
			      num1 = a[i];
			      break;
			    }
			  }
			  
			  for(int i = b.length-1 ; i >= 0 ; i--){
			    if(b[i] % 10 == 0){
			      num2 = b[i];
			      break;
			    }
			  }
			  
			  System.out.println(num1+num2);
			}


	}

}
