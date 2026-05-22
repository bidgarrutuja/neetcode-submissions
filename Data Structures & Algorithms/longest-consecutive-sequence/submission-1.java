class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int num:nums){
            int curr=num;
            int maxlen=0;
            while(set.contains(curr)){
                maxlen++;
                curr++;
            }
            max=Math.max(maxlen,max);
        }
        return max;
    }
}
