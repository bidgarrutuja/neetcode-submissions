class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[][] cars=new int[n][2];
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(cars[j][0] > cars[j+1][0]){
                    int[] temp=cars[j];
                    cars[j]=cars[j+1];
                    cars[j+1]=temp;
                }
            }
        }
        Stack<Double> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            double time=(double)(target-cars[i][0])/cars[i][1];
            if(stack.isEmpty() || time>stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
