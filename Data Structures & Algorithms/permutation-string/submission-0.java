class Solution {
    private static boolean isTrue(String s, String s1){
        int[] freq = new int[26];
        for(int i=0; i<s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            freq[s1.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        // int[] freq = new int[26];
        int i=0;
        int j=s1.length();
        while(j<=s2.length()){
            String s = s2.substring(i,j);

            if(isTrue(s, s1)){
                return true;
            }
            
                i++;
                j++;
            
        }
        return false;
    }
}
