package codingQuestion;

import java.util.ArrayList;
import java.util.List;

class Main1{


	public static List<Integer> findNum(int []nums){
		
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < nums.length; i++){
			int index = Math.abs(nums[i]) -1 ;
			if(nums[index] >0 ) {
				nums[index] = -nums[index];
			}
			
		}
		
		for(int i = 0 ; i < nums.length; i++) {
			if(nums[i] > 0) {
				result.add(i);
			}
		}
		return result ;
	}
}


/*
 * //class Interview{ //public static void main (String args[]){ // // int
 * []nums = { 4,3,2,7,8,2,3,1}; // } //}
 */
