class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character , Integer> mpp = new HashMap<>();
        int l = 0;
        int r = 0;
        int len = 0;
        while(r<s.length()){
            if(mpp.containsKey(s.charAt(r))) l = Math.max(mpp.get(s.charAt(r) )+ 1, l);

            mpp.put(s.charAt(r) , r);
            len = Math.max(len, r-l + 1);
            r++;
        }
        return len;
    }
}
