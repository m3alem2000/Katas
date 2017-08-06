package twosum;

public class TwoSum {
    public int[] findTwoSum(int[] list, int sum) {
    	if (list == null || list.length < 2) return null;
    	int[] intArr = new int[2];
    	boolean outerbreak = false;
    	for(int i = 0 ; i < list.length-1 ; i++){
    		if(outerbreak){break;}
    		for(int j = 1 ; j < list.length ; j++){
    			if(list[i] + list[j] == sum){
    				outerbreak = true;
    				return new int[]{i, j};
    			}
    		}
    	}
		return null;

    }
}
