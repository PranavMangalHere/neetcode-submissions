class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        int maxfreq = 0;
        int maxlen = 0;
        int l = 0;
        int r = 0;
        while(r<s.length()){
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r),0) + 1);
            maxfreq = Math.max(maxfreq , mpp.get(s.charAt(r)));
            while((r-l+1) - maxfreq > k){
                mpp.put(s.charAt(l), mpp.getOrDefault(s.charAt(l),0) - 1);
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;

    }
}
