class Solution {
    public int[] getConcatenation(int[] nums) {
       int ans[]= new int[2*nums.length]; 
       int n=nums.length;
       for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        ans[i+n]=nums[i];
       }
       return ans;
    }
}