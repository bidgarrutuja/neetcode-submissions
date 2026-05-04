public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> cntS = new HashMap<>();
        HashMap<Character, Integer> cntT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            cntS.put(s.charAt(i), cntS.getOrDefault(s.charAt(i), 0) + 1);
            cntT.put(t.charAt(i), cntT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return cntS.equals(cntT);
    }
}