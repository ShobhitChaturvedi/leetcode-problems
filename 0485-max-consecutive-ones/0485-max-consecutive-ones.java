class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int t=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0){
                t=0;

            }else{
                t++;
            }
            if(t>max){
                max=t;
                
            }

        }return max;
    }
}