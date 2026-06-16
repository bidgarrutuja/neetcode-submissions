class Solution {
    public int maxArea(int[] heights) {
        int max=0;
       int left=0,right=heights.length-1;
       
       while(left<right){
            int h=0,width=0,area=0;
            h=Math.min(heights[left],heights[right]);
            width=right-left;
            area=h*width;
            max=Math.max(max,area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
       } 
       return max;
    }
}
