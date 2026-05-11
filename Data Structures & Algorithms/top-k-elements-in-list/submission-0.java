class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

         int j=0;
        while(k>0){
           
            int element=0;
            int freq=0;

            for(int key: map.keySet()){
                if(map.get(key)>freq){
                    freq=map.get(key);
                    element=key;
                }
            }
            ans[j]=element;
            j++;

            map.remove(element);
            k--;
        }
        return ans;
    }
}
