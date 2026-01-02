import java.util.Arrays;
class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
       

        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
            
        }
        return -1;
    }
}