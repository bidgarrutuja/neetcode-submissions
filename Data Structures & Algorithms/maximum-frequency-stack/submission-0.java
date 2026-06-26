class FreqStack {

    HashMap<Integer,Integer> freq;
    HashMap<Integer,Stack<Integer>> group;
    int maxFreq;

    public FreqStack() {
        freq=new HashMap<>();
        group=new HashMap<>();
        maxFreq=0;
    }
    
    public void push(int val) {
        freq.put(val,freq.getOrDefault(val,0)+1);
        int f=freq.get(val);
        if(f>maxFreq){
            maxFreq=f;
        }
        if(!group.containsKey(f)){
            group.put(f,new Stack<>());
        }
        group.get(f).push(val);
    }
    
    public int pop() {
        int val=group.get(maxFreq).pop();
        freq.put(val,freq.get(val)-1);
        if(group.get(maxFreq).isEmpty()){
            maxFreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */