class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int num:nums){
            int maxlong=0;
            int curr=num;
            while(set.contains(curr)){
                maxlong++;
                curr++;
            }
            max=Math.max(maxlong,max);
        }
        return max;
    }
}
