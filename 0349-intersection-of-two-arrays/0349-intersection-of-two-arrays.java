class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer> al=new ArrayList<>();       
        int k=0;
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                al.add(nums2[i]);
                set.remove(nums2[i]);
               
            }
        }
        int[] ans=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i]=al.get(i);

        }
       
        return ans;
    }
}