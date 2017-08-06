package commons_in_two_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonTwo {

	public int commonTwo(String[] a, String[] b) {
		String[] largeArr = null;
		String[]	smallArr;

		for(int i = 0 ; i < a.length ; i++){
			for(int j = i+1 ; j < a.length ; j++){
				if(a[i] == a[j]){
					a[j] = null;
				}
			}
		}

		for(int i = 0 ; i < b.length ; i++){
			for(int j = i+1 ; j < b.length ; j++){
				if(b[i] == b[j]){
					b[j] = null;
				}
			}
		}

		List<String> listA = new ArrayList<String>(Arrays.asList(a));
		listA.removeAll(Collections.singleton(null));
		a = listA.toArray(new String[listA.size()]);

		List<String> listB = new ArrayList<String>(Arrays.asList(b));
		listB.removeAll(Collections.singleton(null));
		b = listB.toArray(new String[listB.size()]);

		Arrays.sort(a);
		Arrays.sort(b);

		if(a.length >= b.length){
			largeArr = a;
			smallArr = b;
		}else{
			largeArr = b;
			smallArr = a;
		}
		int k =0;
		for(int i = 0 ; i < smallArr.length ; i++){
			for(int j = 0 ; j < largeArr.length ; j++){
				if(smallArr[i] == largeArr[j]){
					k++;
					break;
				}
			}
		}
		return k;
	}
}
