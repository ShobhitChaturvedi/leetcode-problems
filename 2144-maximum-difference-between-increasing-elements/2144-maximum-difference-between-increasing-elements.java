class Solution {
    public int maximumDifference(int[] nums) {
       int sum=0;
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(nums[i]-nums[j]>sum && j<i){
            sum=nums[i]-nums[j];
        }

        }
        

       }
       if(sum==0){
        return -1;
       }return sum;
    }
}