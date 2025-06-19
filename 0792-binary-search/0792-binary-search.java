class Solution {
    public int search(int[] nums, int target) {
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return t;
            }
            t++;
            if(t==nums.length){
                return -1;
            }
        }return t;
    }
}