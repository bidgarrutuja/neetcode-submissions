class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> stack=new Stack<>();
        for (String op : ops){
            if (op.equals("C")) {
                stack.pop();
            }else if(op.equals("D")){
                stack.push(2*stack.peek());
            }else if(op.equals("+")){
                int a=stack.pop();
                int b=stack.peek();
                stack.push(a);
                stack.push(a + b);
            }else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }

        return sum;
    }
}