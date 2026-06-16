class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int right=heights.length-1,left=0;
        while(left<right){
            int h=0,area=0,width=0;
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
