package leetcode;

class Solution {
    public int candy(int[] ratings) {
    	int n = ratings.length;
    	int candy_number = 0;
    	for(int i=0;i<n;i++) {
    		candy_number++;
    		if(i==0) {
    			if(ratings[i]>ratings[i+1]) {
    				candy_number++;
    			}
    		}
    		else if(i!=n && i!=0) {
    			if(ratings[i]>ratings[i+1] || ratings[i]>ratings[i-1]) {
    				candy_number++;
    				}
    			}
    		else {
    			if(ratings[i]>ratings[i-1]) {
    				candy_number++;
    			}
    		}
    		}
    	return candy_number;
    	
    }
}