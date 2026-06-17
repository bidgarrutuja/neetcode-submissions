class Solution {
    public int trap(int[] height) {
        int start=0,end=height.length-1;
        int startmax=0,endmax=0;
        int total=0;
        while(start<end){
            if(height[start]<=height[end]){
                if(height[start]>=startmax){
                    startmax=height[start];
                }else{
                    total+=startmax-height[start];
                }
                start++;
            }else{
                if(height[end]>=endmax){
                    endmax=height[end];
                }else{
                    total+=endmax-height[end];
                }
                end--;
            }
        }
        return total;
    }
}
