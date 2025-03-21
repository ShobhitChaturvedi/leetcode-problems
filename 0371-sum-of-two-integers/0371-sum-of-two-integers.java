class Solution {
    public int getSum(int a, int b) {
        int result=a^b;
        int carry=a&b;
        if (carry==0){
            return result;
        }
        else{
            return getSum(result,carry<<1);
        }

    }
}