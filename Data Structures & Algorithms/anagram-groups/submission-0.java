class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> mpp = new HashMap<>();

        for(int i=0; i<strs.length; i++){

            char[] strArray = strs[i].toCharArray();
            Arrays.sort(strArray);
            String sortedString = String.valueOf(strArray);

            if(!mpp.containsKey(sortedString)){
                mpp.put(sortedString, new ArrayList<>());
            }

            mpp.get(sortedString).add(strs[i]);
        }

        
        return new ArrayList<>(mpp.values());
    }
}
