class Solution {
    public long coloredCells(int n) {
        long ans=1;
        long step=4;
        if(n==1){
            return 1;
        }
        for (int i=2;i<=n;i++){
            ans+=step;
            step=step+4;
        }

        return ans;
    }
}