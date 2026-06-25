class Solution {
    public String decodeString(String s) {
          Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch != ']'){
                stack.push(ch);
            }else{
                StringBuilder sb=new StringBuilder();
                while(stack.peek() != '['){
                    sb.insert(0, stack.pop());
                }
                stack.pop();
                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    num.insert(0, stack.pop());
                }
                int count = Integer.parseInt(num.toString());
                StringBuilder repeated = new StringBuilder();
                for(int i=0;i<count;i++){
                    repeated.append(sb);
                }

                for(char c:repeated.toString().toCharArray()){
                    stack.push(c);
                }
            }
        }

        StringBuilder ans=new StringBuilder();
        while(!stack.isEmpty()){
            ans.insert(0, stack.pop());
        }
        return ans.toString();
    }
}