class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int max=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
        while(!stack.isEmpty() && (i==n || heights[stack.peek()]>heights[i])){              
                int h=heights[stack.pop()];
                int w;
                if(stack.isEmpty()){
                    w=i;
                }else{
                    w=i-stack.peek()-1;
                }
                int area=h*w;
                max=Math.max(max,area);
            }
            stack.push(i);
        }
        return max;
    }
    
}
