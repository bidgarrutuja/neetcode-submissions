class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] nums,int k,int limit){
        int parts=1,sum=0;
        for(int num:nums){
            if(sum+num <= limit){
                sum+=num;
            }else{
                parts++;
                sum=num;
            }
        }
        return parts<=k;
    }
}