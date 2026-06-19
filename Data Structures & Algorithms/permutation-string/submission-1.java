class Solution {
    public boolean checkInclusion(String s1, String s2) {

         if(s1.length()>s2.length()){
            return false;
         }
         
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s1.length();i++) {
            char ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map2.equals(map1)){
            return true;
        }
        int k=s1.length();
        for(int i=k;i<s2.length();i++){
            char add=s2.charAt(i);
            map2.put(add,map2.getOrDefault(add,0)+1);

            char remove=s2.charAt(i-k);
            map2.put(remove,map2.get(remove)-1);

            if(map2.get(remove)== 0){
                map2.remove(remove);
            }

            if (map2.equals(map1)){
                return true;
            }
            
        }
        return false;

    }
}
