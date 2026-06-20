class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[] freq=new int[128];
        for(int ch:t.toCharArray()){
            freq[ch]++;
        }
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            
            int ch=s.charAt(right);

            if(freq[ch]>0){
                count++;
            }

            freq[ch]--;

            while(count==t.length()){

                if(right-left+1 < minlen){
                    minlen=right-left+1;
                    start=left;

                }

                int leftchar=s.charAt(left);
                
                freq[leftchar]++;

                if(freq[leftchar]>0){
                     count--;
                }

                
                left++;

            }
        
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minlen);
    }
}