class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canship(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public boolean canship(int[] weights,int d,int capacity){
        int reqD=1;
        int currL=0;
        for(int w:weights){
            if(currL+w>capacity){
                reqD++;
                currL=w;
            }else{
                currL+=w;
            }
        }
        return reqD<=d;
    }
}